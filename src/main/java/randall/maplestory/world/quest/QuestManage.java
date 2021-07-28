package randall.maplestory.world.quest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import randall.maplestory.logger.StopwatchMark;
import randall.maplestory.repository.WzQuestDataRepository;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
public class QuestManage {

    private static Map<Integer, MapleQuest> quests = new LinkedHashMap<>();

    private final WzQuestDataRepository wzQuestDataRepository;

    @StopwatchMark("加载任务数据")
    public void initQuests() {
        wzQuestDataRepository.findAll().forEach(wzQuestData ->
                quests.put(wzQuestData.getQuestid(), new MapleQuest(wzQuestData)));
        log.info("共加载 {} 个任务信息。", quests.size());
    }
}
