package randall.maplestory.init;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import randall.maplestory.world.WorldServer;

@Component
@RequiredArgsConstructor
public class WorldServerInitializer implements ApplicationRunner {

    private final WorldServer worldServer;

    @Override
    public void run(ApplicationArguments args) {
        worldServer.init();
    }
}
