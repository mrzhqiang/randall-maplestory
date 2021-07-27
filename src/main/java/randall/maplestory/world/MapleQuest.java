package randall.maplestory.world;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import randall.maplestory.domain.WzQuestActQuestData;
import randall.maplestory.repository.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
public class MapleQuest {

    private static Map<Integer, MapleQuest> quests = new LinkedHashMap<>();

    private final WzQuestDataRepository wzQuestDataRepository;
    private final WzQuestReqDataRepository wzQuestReqDataRepository;
    private final WzQuestActDataRepository wzQuestActDataRepository;
    private final WzQuestActSkillDataRepository wzQuestActSkillDataRepository;
    private final WzQuestActQuestData wzQuestActQuestData;
    private final WzQuestActItemDataRepository wzQuestActItemDataRepository;
    private final WzQuestPartyDataRepository wzQuestPartyDataRepository;

    public void initQuests() {
        // todo 重构以上数据表，支持联合关系
//        wzQuestDataRepository.findAll().forEach(wzQuestData -> {
//            quests.put(wzQuestData.getQuestid(), )
//        });
    }
}
