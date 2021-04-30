package randall.maplestory.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import randall.maplestory.account.AccountRepository;

import javax.annotation.Nonnull;
import javax.transaction.Transactional;

/**
 * An ApplicationStartedEvent is sent after the context has been refreshed
 * but before any application and command-line runners have been called.
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class DatabaseInitializer implements ApplicationListener<ApplicationStartedEvent> {

    private final AccountRepository accountRepository;

    @Transactional
    @Override
    public void onApplicationEvent(@Nonnull ApplicationStartedEvent event) {
        accountRepository.updateLoggedIn(0);
        accountRepository.updateLastGainHM(0L);
    }
}
