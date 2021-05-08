package randall.maplestory.world.family;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RequiredArgsConstructor
public class FamilyManage {

    private final Map<Integer, MapleFamily> familyMap = new ConcurrentHashMap<>();

    private final FamilyService service;

    @StopwatchMark("加载学院系统")
    public void init() {
        service.loadAll().stream()
                .filter(MapleFamily::proper)
                .forEach(it -> familyMap.put(it.getFamilie().getFamilyid(), it));
    }
}
