package randall.maplestory.world.guild;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
@RequiredArgsConstructor
public class GuildManage {

    private final Map<Integer, MapleGuild> guilds = new ConcurrentHashMap<>();

    private final GuildService service;

    @StopwatchMark("加载家族系统")
    public void init() {
        service.loadAll().stream()
                .filter(it -> Objects.nonNull(it.getGuild().getLeader()))
                .forEach(it -> guilds.put(it.getGuild().getGuildid(), it));
    }
}
