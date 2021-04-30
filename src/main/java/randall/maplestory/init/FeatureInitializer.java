package randall.maplestory.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import randall.maplestory.config.MapleStoryProperties;

import javax.annotation.Nonnull;

/**
 * An ApplicationReadyEvent is sent after any application and command-line runners have been called.
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class FeatureInitializer implements ApplicationListener<ApplicationReadyEvent> {

    private final MapleStoryProperties properties;

    @Override
    public void onApplicationEvent(@Nonnull ApplicationReadyEvent event) {
        log.info("【仅管理员登录】是否开启：{}", properties.getWorld().getAdminOnly());
        log.info("【自动注册】是否开启：{}", properties.getWorld().getAutoRegister());
    }
}
