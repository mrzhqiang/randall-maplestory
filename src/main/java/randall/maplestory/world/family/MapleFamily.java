package randall.maplestory.world.family;

import lombok.Getter;
import randall.maplestory.domain.Character;
import randall.maplestory.domain.Familie;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class MapleFamily {

    private final Map<Integer, Character> members = new ConcurrentHashMap<>();

    private final Familie familie;


    public MapleFamily(Familie familie) {
        this.familie = familie;
        familie.getMembers().forEach(it -> members.put(it.getId(), it));
        familie.getMembers().forEach(it -> {
            if (it.getJunior1() > 0 && (members.get(it.getJunior1()) == null || it.getId().equals(it.getJunior1()))) {
                it.setJunior1(0);
            }
            if (it.getJunior2() > 0 && (members.get(it.getJunior2()) == null || it.getId().equals(it.getJunior2())
                    || it.getJunior1().equals(it.getJunior2()))) {
                it.setJunior2(0);
            }
            if (it.getSeniorid() > 0 && (members.get(it.getSeniorid()) == null || it.getId().equals(it.getSeniorid()))) {
                it.setSeniorid(0);
            }
            if (it.getJunior2() > 0 && it.getJunior1() <= 0) {
                it.setJunior1(it.getJunior2());
                it.setJunior2(0);
            }
            if (it.getJunior1() > 0) {
                Character character = members.get(it.getJunior1());
                if (character.getJunior1().equals(it.getId())) {
                    character.setJunior1(0);
                }
                if (character.getJunior2().equals(it.getId())) {
                    character.setJunior2(0);
                }
                if (!character.getSeniorid().equals(it.getId())) {
                    character.setSeniorid(it.getId());
                }
            }
            if (it.getJunior2() > 0) {
                Character character = members.get(it.getJunior2());
                if (character.getJunior1().equals(it.getId())) {
                    character.setJunior1(0);
                }
                if (character.getJunior2().equals(it.getId())) {
                    character.setJunior2(0);
                }
                if (!character.getSeniorid().equals(it.getId())) {
                    character.setSeniorid(it.getId());
                }
            }
        });
        // fixme 太复杂，暂时不实现
//        resetPedigree();
//        resetDescendants(); //set
//        resetGens(); //set
    }

    public boolean proper() {
        return familie.getLeader() != null && members.size() >= 2;
    }
}
