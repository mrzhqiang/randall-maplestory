package randall.maplestory.world.guild;

import lombok.Getter;
import randall.maplestory.domain.Character;
import randall.maplestory.domain.Guild;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class MapleGuild {

    private final Map<Integer, Boolean> memberOnline = new ConcurrentHashMap<>();
    private final Map<Integer, MapleBbsThread> bbs = new ConcurrentHashMap<>();

    private final Guild guild;

    public MapleGuild(@Nonnull Guild guild) {
        this.guild = guild;
        guild.getMembers().stream()
                .map(Character::getId)
                .forEach(id -> memberOnline.put(id, false));
        guild.getThreads().stream()
                .map(MapleBbsThread::new)
                .forEach(it -> bbs.put(it.getBbsThread().getLocalthreadid(), it));
    }

    // proper = !guild.getMembers().isEmpty() && guild.getLeader() != null
    // if false than No members in guild. Impossible... guild is disbanding
    public boolean proper() {
        return !guild.getMembers().isEmpty() && guild.getLeader() != null;
    }
}
