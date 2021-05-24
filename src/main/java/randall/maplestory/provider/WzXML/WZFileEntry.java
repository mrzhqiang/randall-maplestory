package randall.maplestory.provider.WzXML;

import randall.maplestory.provider.MapleDataEntity;
import randall.maplestory.provider.MapleDataFileEntry;

public class WZFileEntry extends WZEntry implements MapleDataFileEntry {

    private int offset;

    public WZFileEntry(String name, int size, int checksum, MapleDataEntity parent) {
        super(name, size, checksum, parent);
    }

    @Override
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
