package randall.maplestory.world.quest;

import com.google.common.collect.ImmutableMap;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Pair;
import randall.maplestory.domain.WzQuestActData;
import randall.maplestory.domain.WzQuestActItemData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapleQuestAction implements Serializable {
    private static final long serialVersionUID = 9179541993413738569L;

    private final List<Integer> applicableJobs = new ArrayList<>();

    private MapleQuestActionType type;
    private MapleQuest quest;
    private int intStore;

    private List<QuestItem> items = null;
    private List<Map<Integer, Pair<Integer, Integer>>> skill = null;
    private List<Pair<Integer, Integer>> state = null;

    public MapleQuestAction(MapleQuestActionType type, WzQuestActData rse, MapleQuest quest) {
        this.type = type;
        this.quest = quest;

        this.intStore = rse.getIntStore();
        String applicableJobs = rse.getApplicableJobs();
        String[] jobs = applicableJobs.split(", ");
        if ((jobs.length <= 0) && !applicableJobs.isEmpty()) {
            this.applicableJobs.add(Integer.parseInt(applicableJobs));
        }
        for (String j : jobs) {
            if (j.length() > 0) {
                this.applicableJobs.add(Integer.parseInt(j));
            }
        }
        switch (type) {
            case item:
                // 应该直接初始化，最多这里清理一下旧数据
                items = new ArrayList<>();
                rse.getItemDataList().forEach(it -> items.add(new QuestItem(it))); //, rs.getInt("jobEx")
                break;
            case quest:
                state = new ArrayList<>();
                rse.getQuestDataList().forEach(it -> state.add(Pair.of(it.getQuest(), it.getState())));
                break;
            case skill:
                skill = new ArrayList<>();
                rse.getSkillDataList().forEach(it -> skill.add(ImmutableMap.of(it.getSkillid(), Pair.of(it.getSkillLevel(), it.getMasterLevel()))));
                break;
        }
    }

    @RequiredArgsConstructor
    public static class QuestItem {

        private final WzQuestActItemData data;
    }
}
