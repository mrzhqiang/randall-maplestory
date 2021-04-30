package randall.maplestory.world.guild;

import lombok.Getter;
import randall.maplestory.domain.Alliance;

@Getter
public class MapleAlliance {

    private final Alliance alliance;

    public MapleAlliance(Alliance alliance) {
        this.alliance = alliance;
    }
}
