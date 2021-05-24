package randall.maplestory.provider;


import randall.maplestory.provider.WzXML.XMLWZFile;

import java.io.File;

public class MapleDataProviderFactory {

    private final static String wzPath = System.getProperty("net.sf.odinms.wzpath", "wz");

    private static MapleDataProvider getWZ(Object in, boolean provideImages) {
        if (in instanceof File) {
            File fileIn = (File) in;

            return new XMLWZFile(fileIn);
        }
        throw new IllegalArgumentException("Can't create data provider for input " + in);
    }

    public static MapleDataProvider getDataProvider(Object in) {
        return getWZ(in, false);
    }

    public static MapleDataProvider getImageProvidingDataProvider(Object in) {
        return getWZ(in, true);
    }

    public static File fileInWZPath(String filename) {
        return new File(wzPath, filename);
    }
}
