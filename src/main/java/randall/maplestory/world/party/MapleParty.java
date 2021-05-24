package randall.maplestory.world.party;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MapleParty {

    private Integer id;
    private MaplePartyCharacter leader;
    private final List<MaplePartyCharacter> members = new LinkedList<>();

    public MapleParty(int id, @Nonnull MaplePartyCharacter leader) {
        this.id = id;
        this.leader = leader;
        this.addMember(leader);
    }

    public boolean containsMember(@Nonnull MaplePartyCharacter member) {
        return members.contains(member);
    }

    public void addMember(@Nonnull MaplePartyCharacter member) {
        this.members.add(member);
    }

    public void removeMember(@Nonnull MaplePartyCharacter member) {
        this.members.remove(member);
    }

    public void updateMember(@Nonnull MaplePartyCharacter newMember) {
        MaplePartyCharacter oldMember = null;
        int i = 0;
        for (; i < members.size(); i++) {
            MaplePartyCharacter member = members.get(i);
            if (newMember.equals(member)) {
                oldMember = member;
                break;
            }
        }
        if (oldMember != null) {
            members.add(i, newMember);
        }
    }

    public MaplePartyCharacter getMemberById(int id) {
        for (MaplePartyCharacter member : members) {
            if (member.getCharacter().getId() == id) {
                return member;
            }
        }
        return null;
    }

    public MaplePartyCharacter getMemberByIndex(int index) {
        return members.get(index);
    }

    public Collection<MaplePartyCharacter> getMembers() {
        return new LinkedList<>(members);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MaplePartyCharacter getLeader() {
        return leader;
    }

    public void setLeader(MaplePartyCharacter leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapleParty that = (MapleParty) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
