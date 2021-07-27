package randall.maplestory.world.timer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * EnableAsync 默认是 spring.task.execution 配置。
 * <p>
 * EnableScheduling 通过检测是否存在 ScheduledExecutorService 来设定执行器。
 * <p>
 * 后续需要主动调用 ScheduledExecutorService 的地方，也可以将它注入再调用。
 * <p>
 * fixme 在 079 版本中，每个不同的功能都创建一个线程池，我们后面再看看要不要这样做。
 */
@EnableAsync
@EnableScheduling
@Configuration
public class TimerConfiguration {

    @Bean
    public ScheduledExecutorService executorService() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(4);
        executor.setKeepAliveTime(10, TimeUnit.MINUTES);
        executor.setMaximumPoolSize(8);
        executor.allowCoreThreadTimeOut(true);
        // default is false
        // executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
        return executor;
    }
}
