package randall.maplestory.world.messenger;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@RequiredArgsConstructor
public class MessengerManage {

    private final Map<Integer, MapleMessenger> messengers = new HashMap<>();

    private final AtomicInteger runningMessengerId = new AtomicInteger(1);

    public MapleMessenger getMessenger(int messengerId) {
        return messengers.get(messengerId);
    }
}
