package randall.maplestory;


import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.comparator.Comparators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * HashMap 性能测试。
 * <p>
 * 前提：多线程环境，主要测试 读数据 的性能。
 * <p>
 * 1. synchronized：JVM 控制的锁，自动升级。由于锁住的是整个对象，当读操作发生时，会阻塞其他读操作，导致性能下降。
 * <p>
 * 2. ReentrantReadWriteLock：API 级别的锁，可重入。读操作不互斥，因此当没有其他线程获取 写锁 时，读操作的性能最高。
 * <p>
 * 要求：保证线程安全。
 * <p>
 * 结论：
 * 1. synchronized 因为独特的稳定性，在低延迟任务处理上，表现比较好；
 * <p>
 * 2. ReentrantReadWriteLock 的 ReadWriteLock 不互斥，因此在锁内的耗时比较高的情况下，普遍性能优于 synchronized 20--30 倍。
 * <p>
 * 3. 读多写少的情况下，如果读操作比较耗时，使用 ReentrantReadWriteLock 中的读锁可以保证性能，但更方便的是 ConcurrentHashMap。
 * <p>
 * 4. 读少写多的情况下，操作比较耗时也推荐用 ReentrantReadWriteLock，否则 synchronized 性能更稳定。
 */
public class HashMapTest {

    // 持续时长 2s，限定操作在 2s 内处理完毕，但实际上寻找的是 QPS
    private static final long READ_DURATION = TimeUnit.SECONDS.toMillis(3);
    // 读操作的线程总数
    private static final int READ_THREAD_COUNT = 20;
    // 每个线程的读操作次数
    private static final int READ_TOTAL = 800;

    // 对象锁：32000 * 200
    private static final Object SYNC_LOCK = new Object();
    // 可重入锁：18000 * 200, 170000 * 20
    private static final ReadWriteLock LOCK = new ReentrantReadWriteLock();
    // 读锁
    private static final Lock readLock = LOCK.readLock();

    private static final String READ_KEY = "read";
    // 正常 HashMap，不考虑扩容问题
    private final Map<String, LongAdder> hashMap = new HashMap<>();
    private final LongAdder threadFinished = new LongAdder();

    // 打印消息的模板
    private static final String USE_TIME = "use time: %s%n";
    private static final String FINISHED_QPS = "+++ Finished: %s q/s +++%n";
    private static final List<Stopwatch> STOPWATCH_LIST = Lists.newArrayListWithCapacity(READ_THREAD_COUNT);

    @Before
    public void init() {
        hashMap.put(READ_KEY, threadFinished);
    }

    /**
     * 1. 20 thread 400000 total
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.9708998S
     * +++ Finished: 8000000 q/s +++
     * use time: PT1.01042S
     * +++ Finished: 8000000 q/s +++
     * use time: PT1.0231478S
     * +++ Finished: 8000000 q/s +++
     * use time: PT1.0907063S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.9893666S
     * <p>
     * 2. 1 thread 8000000 total
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.6018539S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5501261S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5641406S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5660869S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5630941S
     * <p>
     * 3. 设定每个读操作耗时 1ms，20 thread 90 total
     * +++ Finished: 1800 q/s +++
     * use time: PT2.7878717S
     * +++ Finished: 1800 q/s +++
     * use time: PT2.8027723S
     * +++ Finished: 1800 q/s +++
     * use time: PT2.8030939S
     * +++ Finished: 1800 q/s +++
     * use time: PT2.8246574S
     * +++ Finished: 1800 q/s +++
     * use time: PT2.7961494S
     */
    @Test
    public void syncRead() {
        // thread count control
        int threadCount = READ_THREAD_COUNT;
        while (Thread.currentThread().isAlive()) {
            if (threadCount <= 0) {
                try {
                    // exit after the duration
                    Thread.sleep(READ_DURATION);
                    if (READ_TOTAL * READ_THREAD_COUNT == threadFinished.longValue()) {
                        System.out.printf(FINISHED_QPS, threadFinished.longValue());
                        STOPWATCH_LIST.stream()
                                .map(Stopwatch::elapsed)
                                .max(Comparators.comparable())
                                .map(s -> String.format(USE_TIME, s))
                                .ifPresent(System.out::println);
                    }
                } catch (InterruptedException ignore) {
                }
                break;
            }
            threadCount--;
            // thread operation
            new Thread(() -> {
                Stopwatch started = Stopwatch.createUnstarted();
                for (int i = 0; i < READ_TOTAL; i++) {
                    started.start();
                    synchronized (SYNC_LOCK) {
                        hashMap.get(READ_KEY).increment();
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ignore) {
                        }
                    }
                    started.stop();
                }
                STOPWATCH_LIST.add(started);
            }).start();
        }
    }

    /**
     * 1. 1 thread 8000000 total
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.6374094S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5470269S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5459759S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5503431S
     * +++ Finished: 8000000 q/s +++
     * use time: PT0.5345361S
     * <p>
     * 2. 20 thread 400000 total
     * +++ Finished: 8000000 q/s +++
     * use time: PT2.2309545S
     * +++ Finished: 8000000 q/s +++
     * use time: PT2.204814S
     * +++ Finished: 8000000 q/s +++
     * use time: PT2.1721013S
     * +++ Finished: 8000000 q/s +++
     * use time: PT2.1299746S
     * +++ Finished: 8000000 q/s +++
     * use time: PT2.1278045S
     * <p>
     * 3. 设定每个读操作耗时 1ms，20 thread 90 total
     * +++ Finished: 1800 q/s +++
     * use time: PT0.1348379S
     * +++ Finished: 1800 q/s +++
     * use time: PT0.1363789S
     * +++ Finished: 1800 q/s +++
     * use time: PT0.1371774S
     * +++ Finished: 1800 q/s +++
     * use time: PT0.1327325S
     * +++ Finished: 1800 q/s +++
     * use time: PT0.1367117S
     */
    @Test
    public void reentrantRead() {
        // thread count control
        int threadCount = READ_THREAD_COUNT;
        while (Thread.currentThread().isAlive()) {
            if (threadCount <= 0) {
                try {
                    // exit after the duration
                    Thread.sleep(READ_DURATION);
                    if (READ_TOTAL * READ_THREAD_COUNT == threadFinished.longValue()) {
                        System.out.printf(FINISHED_QPS, threadFinished.longValue());
                        STOPWATCH_LIST.stream()
                                .map(Stopwatch::elapsed)
                                .max(Comparators.comparable())
                                .map(s -> String.format(USE_TIME, s))
                                .ifPresent(System.out::println);
                    }
                } catch (InterruptedException ignore) {
                }
                break;
            }
            threadCount--;
            // thread operation
            new Thread(() -> {
                Stopwatch started = Stopwatch.createUnstarted();
                for (int i = 0; i < READ_TOTAL; i++) {
                    started.start();
                    readLock.lock();
                    try {
                        hashMap.get(READ_KEY).increment();
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ignore) {
                        }
                    } finally {
                        readLock.unlock();
                    }
                    started.stop();
                }
                STOPWATCH_LIST.add(started);
            }).start();
        }
    }
}
