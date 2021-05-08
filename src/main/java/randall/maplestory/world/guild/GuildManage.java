package randall.maplestory.world.guild;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RequiredArgsConstructor
public class GuildManage {

    private final Map<Integer, MapleGuild> guilds = new ConcurrentHashMap<>();

    private final GuildService service;

    @StopwatchMark("加载家族系统")
    public void init() {
        service.loadAll().stream()
                .filter(MapleGuild::proper)
                .forEach(it -> guilds.put(it.getGuild().getGuildid(), it));
    }
}
