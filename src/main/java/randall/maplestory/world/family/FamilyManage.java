package randall.maplestory.world.family;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;
import randall.maplestory.repository.FamilieRepository;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RequiredArgsConstructor
public class FamilyManage {

    private final Map<Integer, MapleFamily> familyMap = new ConcurrentHashMap<>();

    private final FamilyService service;

    @StopwatchMark("加载学院系统")
    public void init() {
        service.loadAll().stream()
                .filter(it -> Objects.nonNull(it.getFamilie().getLeader()))
                .forEach(it -> familyMap.put(it.getFamilie().getFamilyid(), it));
    }
}
