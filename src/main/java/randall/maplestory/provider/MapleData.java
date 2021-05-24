package randall.maplestory.provider;

import randall.maplestory.provider.WzXML.MapleDataType;

import java.util.List;

public interface MapleData extends MapleDataEntity, Iterable<MapleData> {

    String getName();

    MapleDataType getType();

    List<MapleData> getChildren();

    MapleData getChildByPath(String path);

    Object getData();
}
