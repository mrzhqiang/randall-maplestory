package randall.maplestory.world.quest;

public enum MapleQuestActionType {

    UNDEFINED(-1),
    exp(0),
    item(1),
    nextQuest(2),
    money(3),
    quest(4),
    skill(5),
    pop(6),
    buffItemID(7),
    infoNumber(8),
    yes(9),
    no(10),
    sp(11);

    final byte type;

    MapleQuestActionType(int type) {
        this.type = (byte) type;
    }

    public byte getType() {
        return type;
    }

    public static MapleQuestActionType getByType(byte type) {
        for (MapleQuestActionType l : values()) {
            if (l.getType() == type) {
                return l;
            }
        }
        return null;
    }

    public static MapleQuestActionType getByWZName(String name) {
        try {
            return valueOf(name);
        } catch (IllegalArgumentException ex) {
            return UNDEFINED;
        }
    }
}
