package randall.maplestory.world.guild;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RequiredArgsConstructor
public class GuildManage {

    // 原版本是 LinkedHashMap，以插入顺序排序，读写加锁
    private final Map<Integer, MapleGuild> guilds = new ConcurrentHashMap<>();

    private final GuildService service;

    @StopwatchMark("加载家族系统")
    public void init() {
        service.loadAll().stream()
                .filter(MapleGuild::proper)
                .forEach(it -> guilds.put(it.getGuild().getGuildid(), it));
    }
}
