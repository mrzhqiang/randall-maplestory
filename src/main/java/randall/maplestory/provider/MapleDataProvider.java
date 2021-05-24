package randall.maplestory.provider;

public interface MapleDataProvider {

    MapleDataDirectoryEntry getRoot();

    MapleData getData(String path);
}
