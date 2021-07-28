package randall.maplestory.world.quest;

import org.springframework.data.util.Pair;
import randall.maplestory.domain.WzQuestData;

import java.util.*;

public class MapleQuest {

    private final Map<Integer, Integer> relevantMobs = new LinkedHashMap<>();
    private final List<MapleQuestRequirement> startReqs = new LinkedList<>();
    private final List<MapleQuestRequirement> completeReqs = new LinkedList<>();
    private final List<MapleQuestAction> startActs = new LinkedList<>();
    private final List<MapleQuestAction> completeActs = new LinkedList<>();
    private final Map<String, List<Pair<String, Pair<String, Integer>>>> partyQuestInfo = new LinkedHashMap<>();

    private final WzQuestData questData;

    private boolean customend;
    private boolean scriptedStart;
    private boolean autoStart;
    private boolean repeatable;

    public MapleQuest(WzQuestData questData) {
        this.questData = questData;
        questData.getQuestReqDataList().forEach(it -> {
            MapleQuestRequirementType type = MapleQuestRequirementType.getByWZName(it.getName());
            MapleQuestRequirement req = new MapleQuestRequirement(this, type, it);
            if (type.equals(MapleQuestRequirementType.interval)) {
                repeatable = true;
            } else if (type.equals(MapleQuestRequirementType.normalAutoStart)) {
                repeatable = true;
                autoStart = true;
            } else if (type.equals(MapleQuestRequirementType.startscript)) {
                scriptedStart = true;
            } else if (type.equals(MapleQuestRequirementType.endscript)) {
                customend = true;
            } else if (type.equals(MapleQuestRequirementType.mob)) {
                for (Pair<Integer, Integer> mob : req.getDataStore()) {
                    relevantMobs.put(mob.getFirst(), mob.getSecond());
                }
            }
            if (it.getType() == 0) {
                startReqs.add(req);
            } else {
                completeReqs.add(req);
            }
        });
        questData.getQuestActDataList().stream()
                .filter(it -> MapleQuestActionType.getByWZName(it.getName()) != MapleQuestActionType.item
                        || (it.getId() != 7103 && it.getId() != 7102))
                .forEach(it -> {
                    MapleQuestActionType type = MapleQuestActionType.getByWZName(it.getName());
                    if (it.getType() == 0) {
                        startActs.add(new MapleQuestAction(type, it, this));
                    } else {
                        completeActs.add(new MapleQuestAction(type, it, this));
                    }
                });
        questData.getQuestPartyDataList().forEach(it -> {
            if (!partyQuestInfo.containsKey(it.getRank())) {
                partyQuestInfo.put(it.getRank(), new ArrayList<>());
            }
            partyQuestInfo.get(it.getRank()).add(Pair.of(it.getMode(), Pair.of(it.getProperty(), it.getValue())));
        });
    }
}
