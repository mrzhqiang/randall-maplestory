package randall.maplestory.world.family;

import lombok.Getter;
import randall.maplestory.domain.Familie;

@Getter
public class MapleFamily {

    private final Familie familie;


    public MapleFamily(Familie familie) {
        this.familie = familie;
        // fixme 学院系统写得好复杂，暂时不实现
    }
}
