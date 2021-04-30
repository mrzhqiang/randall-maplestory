package randall.maplestory.world.guild;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Component
@RequiredArgsConstructor
public class AllianceManage {

    private final Map<Integer, MapleAlliance> alliances = new ConcurrentHashMap<>();

    private final AllianceService service;

    @StopwatchMark("加载家族联盟系统")
    public void init() {
        service.loadAll().forEach(it -> alliances.put(it.getAlliance().getId(), it));
    }
}
