package randall.maplestory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import randall.maplestory.account.AccountRepository;
import randall.maplestory.config.MapleStoryProperties;
import randall.maplestory.world.MapleLifeFactory;
import randall.maplestory.world.WorldServer;

import javax.annotation.Nonnull;

/**
 * ApplicationEvent 按以下顺序发送：
 * <p>
 * 1. ApplicationStartingEvent 在 run 开始之后，在任何处理之前（监听器和初始化器的注册除外）
 * <p>
 * 2. ApplicationEnvironmentPreparedEvent 在环境变量准备好之后，在创建 ApplicationContext 之前
 * <p>
 * 3. ApplicationContextInitializedEvent 在 ApplicationContext 初始化之后，在任何 bean 定义被加载之前
 * <p>
 * 4. ApplicationPreparedEvent 在加载 bean 定义之后，在 ApplicationContext 刷新之前
 * <p>
 * 5. ApplicationStartedEvent 在 ApplicationContext 刷新之后，在调用 ApplicationRunner 和 CommandLineRunner 之前
 * <p>
 * 此时调用 ApplicationRunner 和 CommandLineRunner 的实现，可以使用 @Order 或实现 Ordered 接口来定义执行顺序（从小到大）
 * <p>
 * 6. AvailabilityChangeEvent 在进入 LivenessState.CORRECT 之后，标识应用是活动状态
 * <p>
 * 7. ApplicationReadyEvent 在调用 ApplicationRunner 和 CommandLineRunner 之后
 * <p>
 * 8. AvailabilityChangeEvent 在进入 ReadinessState.ACCEPTING_TRAFFIC 之后，标识应用已准备好为请求提供服务
 * <p>
 * 9. ApplicationFailedEvent 在启动时出现异常之后
 *
 * @see org.springframework.boot.SpringApplication#run(java.lang.String...)
 */
@SpringBootApplication
public class RandallMapleStory {

    public static void main(String[] args) {
        SpringApplication.run(RandallMapleStory.class, args);
    }

    @Component
    @RequiredArgsConstructor
    public static class DatabaseInitializer implements ApplicationListener<ApplicationStartedEvent> {

        private final AccountRepository accountRepository;

        @Override
        public void onApplicationEvent(@Nonnull ApplicationStartedEvent event) {
            // 重置数据库登录状态
            accountRepository.updateLoggedIn(0);
            accountRepository.updateLastGainHM(0L);
        }
    }

    @Component
    @RequiredArgsConstructor
    public static class ServerInitializer implements ApplicationRunner {

        private final WorldServer worldServer;
        private final MapleLifeFactory mapleLifeFactory;

        @Override
        public void run(ApplicationArguments args) {
            worldServer.init();
            mapleLifeFactory.loadQuestCounts();
        }
    }

    @Slf4j
    @Component
    @RequiredArgsConstructor
    public static class FeatureInitializer implements ApplicationListener<ApplicationReadyEvent> {

        private final MapleStoryProperties properties;

        @Override
        public void onApplicationEvent(@Nonnull ApplicationReadyEvent event) {
            log.info("【仅管理员登录】是否开启：{}", properties.getWorld().getAdminOnly());
            log.info("【自动注册】是否开启：{}", properties.getWorld().getAutoRegister());
        }
    }

}
