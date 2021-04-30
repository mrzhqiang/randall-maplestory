package randall.maplestory.world.channel;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ChannelServer {
    private static final Map<Integer, ChannelServer> CHANNEL_SERVER_MAP = new ConcurrentHashMap<>();

    public static Optional<ChannelServer> findBy(Integer channel) {
        return Optional.ofNullable(channel).map(CHANNEL_SERVER_MAP::get);
    }
}
