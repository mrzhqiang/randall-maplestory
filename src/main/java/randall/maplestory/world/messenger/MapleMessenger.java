package randall.maplestory.world.messenger;

import randall.maplestory.domain.Character;

public class MapleMessenger {

    private final int id;
    private final Character[] members = new Character[3];


    public MapleMessenger(int id, Character character) {
        this.id = id;
        if (members[0] == null) {
            members[0] = character;
        }
    }
}
