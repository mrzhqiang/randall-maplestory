package randall.maplestory.world;

import com.google.common.base.Strings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.config.MapleStoryProperties;
import randall.maplestory.world.channel.ChannelServer;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 角色频道。
 */
@Component
@RequiredArgsConstructor
public final class CharacterChannel {

    private final MapleStoryProperties properties;

    private Map<Integer, Integer> idChannel;
    private Map<String, Integer> nameChannel;

    @PostConstruct
    public void init() {
        Integer userLimit = properties.getWorld().getUserLimit();
        idChannel = new ConcurrentHashMap<>(userLimit);
        nameChannel = new ConcurrentHashMap<>(userLimit);
    }

    public boolean register(Integer id, String name, Integer channel) {
        if (id == null || Strings.isNullOrEmpty(name) || channel == null) {
            return false;
        }

        idChannel.put(id, channel);
        nameChannel.put(name.toLowerCase(Locale.ROOT), channel);
        return true;
    }

    public void forceDeregister(Integer id) {
        if (id == null) {
            return;
        }

        idChannel.remove(id);
    }

    public void forceDeregister(String name) {
        if (Strings.isNullOrEmpty(name)) {
            return;
        }

        nameChannel.remove(name.toLowerCase(Locale.ROOT));
    }

    public void forceDeregister(Integer id, String name) {
        forceDeregister(id);
        forceDeregister(name);
    }

    public int findChannelBy(Integer id) {
        int defaultValue = -1;
        if (id == null) {
            return defaultValue;
        }

        Integer channel = idChannel.get(id);
        if (channel == null) {
            return defaultValue;
        }

        // -10 表示 cash shop
        // -20 表示 cash shop MTS
        if (channel != -10 && channel != -20 && !ChannelServer.findBy(channel).isPresent()) {
            forceDeregister(id);
            return defaultValue;
        }
        return channel;
    }

    public int findChannelBy(String name) {
        int defaultValue = -1;
        if (Strings.isNullOrEmpty(name)) {
            return defaultValue;
        }

        Integer channel = nameChannel.get(name);
        if (channel != null) {
            if (channel != -10 && channel != -20 && !ChannelServer.findBy(channel).isPresent()) {
                forceDeregister(name);
                return defaultValue;
            }
            return channel;
        }
        return defaultValue;
    }

    public List<CharacterChannelPair> toPairs(Collection<Integer> ids) {
        List<CharacterChannelPair> foundPairs = new ArrayList<>(ids.size());
        for (int id : ids) {
            int channel = findChannelBy(id);
            if (channel > 0) {
                foundPairs.add(new CharacterChannelPair(id, channel));
            }
        }

        Collections.sort(foundPairs);
        return foundPairs;
    }
}
