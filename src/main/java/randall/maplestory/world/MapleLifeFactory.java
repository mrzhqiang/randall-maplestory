package randall.maplestory.world;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;
import randall.maplestory.provider.*;
import randall.maplestory.repository.WzNPCNameDataRepository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@RequiredArgsConstructor
@Component
public class MapleLifeFactory {

    private static final MapleDataProvider data = MapleDataProviderFactory
            .getDataProvider(new File(System.getProperty("net.sf.odinms.wzpath") + "/Mob.wz"));

    private final Map<Integer, List<Integer>> questCount = new ConcurrentHashMap<>();
    private final Map<Integer, String> npcNames = new ConcurrentHashMap<>();

    private final WzNPCNameDataRepository npcNameDataRepository;

    @StopwatchMark("初始化 NPC 数据")
    public void loadQuestCounts() {
        if (!questCount.isEmpty()) {
            return;
        }

        // todo refactor here
        for (MapleDataDirectoryEntry mapz : data.getRoot().getSubdirectories()) {
            if (mapz.getName().equals("QuestCountGroup")) {
                for (MapleDataFileEntry entry : mapz.getFiles()) {
                    int id = Integer.parseInt(entry.getName().substring(0, entry.getName().length() - 4));
                    MapleData dat = data.getData("QuestCountGroup/" + entry.getName());
                    if ((dat != null) && (dat.getChildByPath("info") != null)) {
                        List<Integer> z = new ArrayList<>();
                        for (MapleData da : dat.getChildByPath("info")) {
                            z.add(MapleDataUtil.getInt(da, 0));
                        }
                        questCount.put(id, z);
                    } else {
                        log.info("null questcountgroup");
                    }
                }
            }
        }

        npcNameDataRepository.findAll(Sort.by(Sort.Order.by("npc")))
                .forEach(wzNPCNameData ->
                        npcNames.put(wzNPCNameData.getNpc(), wzNPCNameData.getName()));
        log.info("共加载 {} 个 npc", npcNames.size());
    }
}
