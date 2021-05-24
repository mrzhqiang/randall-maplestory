package randall.maplestory.world.party;

import randall.maplestory.domain.Character;

import javax.annotation.Nonnull;
import java.util.Objects;

public class MaplePartyCharacter {

    private final Character character;

    public MaplePartyCharacter(@Nonnull Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaplePartyCharacter that = (MaplePartyCharacter) o;
        return Objects.equals(character.getName(), that.character.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(character.getName());
    }
}
