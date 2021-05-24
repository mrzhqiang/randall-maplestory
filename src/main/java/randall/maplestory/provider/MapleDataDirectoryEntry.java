package randall.maplestory.provider;

import java.util.List;

public interface MapleDataDirectoryEntry extends MapleDataEntry {

    MapleDataEntry getEntry(String name);

    List<MapleDataFileEntry> getFiles();

    List<MapleDataDirectoryEntry> getSubdirectories();
}
