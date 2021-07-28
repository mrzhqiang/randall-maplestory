package randall.maplestory.world.quest;

import lombok.Getter;
import org.springframework.data.util.Pair;
import randall.maplestory.domain.WzQuestReqData;

import java.util.LinkedList;
import java.util.List;

@Getter
public class MapleQuestRequirement {

    private final MapleQuest quest;
    private final MapleQuestRequirementType type;

    private List<Pair<Integer, Integer>> dataStore;
    private int intStore;
    private String stringStore;

    public MapleQuestRequirement(MapleQuest quest, MapleQuestRequirementType type, WzQuestReqData rse) {
        this.quest = quest;
        this.type = type;

        switch (type) {
            case pet:
            case mbcard:
            case mob:
            case item:
            case quest:
            case skill:
            case job:
                this.dataStore = new LinkedList<>();
                String storesFirst = rse.getIntStoresFirst();
                String storesSecond = rse.getIntStoresSecond();

                String[] firsts = storesFirst.split(", ");
                String[] seconds = storesSecond.split(", ");
                if (firsts.length <= 0 && !storesFirst.isEmpty()) {
                    this.dataStore.add(Pair.of(Integer.parseInt(storesFirst), Integer.parseInt(storesSecond)));
                }
                for (int i = 0; i < firsts.length; i++) {
                    String first = firsts[i];
                    String second = seconds[i];
                    if (!first.isEmpty() && !second.isEmpty()) {
                        this.dataStore.add(Pair.of(Integer.parseInt(first), Integer.parseInt(second)));
                    }
                }
                break;
            //case partyQuest_S:
            case dayByDay:
            case normalAutoStart:
            case subJobFlags:
            case fieldEnter:
            case pettamenessmin:
            case npc:
            case questComplete:
            case pop:
            case interval:
            case mbmin:
            case lvmax:
            case lvmin:
                this.intStore = Integer.parseInt(rse.getStringStore());
                break;
            case end:
                this.stringStore = rse.getStringStore();
        }
    }
}
