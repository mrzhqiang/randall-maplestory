package randall.maplestory.provider.WzXML;

import randall.maplestory.provider.MapleCanvas;

import java.awt.*;
import java.awt.image.*;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class PNGMapleCanvas implements MapleCanvas {

    private static final int[] ZAHLEN = new int[]{2, 1, 0, 3};
    private int height;
    private int width;
    private int dataLength;
    private int format;
    private byte[] data;

    public PNGMapleCanvas(int width, int height, int dataLength, int format, byte[] data) {
        super();
        this.height = height;
        this.width = width;
        this.dataLength = dataLength;
        this.format = format;
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getFormat() {
        return format;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public BufferedImage getImage() {
        int sizeUncompressed = 0;
        int size8888 = 0;
        int maxWriteBuf = 2;
        int maxHeight = 3;

        byte[] writeBuf = new byte[maxWriteBuf];

        switch (getFormat()) {
            case 1:
            case 513:
                sizeUncompressed = getHeight() * getWidth() * 4;
                break;
            case 2:
                sizeUncompressed = getHeight() * getWidth() * 8;
                break;
            case 517:
                sizeUncompressed = getHeight() * getWidth() / 128;
                break;
        }

        size8888 = getHeight() * getWidth() * 8;

        if (size8888 > maxWriteBuf) {
            maxWriteBuf = size8888;
            writeBuf = new byte[maxWriteBuf];
        }

        if (getHeight() > maxHeight) {
            maxHeight = getHeight();
        }

        Inflater dec = new Inflater();
        dec.setInput(getData(), 0, dataLength);

        int declen = 0;
        byte[] uc = new byte[sizeUncompressed];

        try {
            declen = dec.inflate(uc);
        } catch (DataFormatException ex) {
            throw new RuntimeException("zlib fucks", ex);
        }

        dec.end();
        // fuck the format
        if (getFormat() == 1) {
            for (int i = 0; i < sizeUncompressed; i++) {
                byte low = (byte) (uc[i] & 0x0F);
                byte high = (byte) (uc[i] & 0xF0);

                writeBuf[(i << 1)] = (byte) (((low << 4) | low) & 0xFF);
                writeBuf[(i << 1) + 1] = (byte) (high | ((high >>> 4) & 0xF));
            }
        } else if (getFormat() == 2) {
            writeBuf = uc;
        } else if (getFormat() == 513) {
            for (int i = 0; i < declen; i += 2) {
                byte bBits = (byte) ((uc[i] & 0x1F) << 3);
                byte gBits = (byte) (((uc[i + 1] & 0x07) << 5) | ((uc[i] & 0xE0) >> 3));
                byte rBits = (byte) (uc[i + 1] & 0xF8);

                writeBuf[(i << 1)] = (byte) (bBits | (bBits >> 5));
                writeBuf[(i << 1) + 1] = (byte) (gBits | (gBits >> 6));
                writeBuf[(i << 1) + 2] = (byte) (rBits | (rBits >> 5));
                writeBuf[(i << 1) + 3] = (byte) 0xFF;
            }
        } else if (getFormat() == 517) {
            byte b = 0x00;
            int pixelIndex = 0;

            for (int i = 0; i < declen; i++) {
                for (int j = 0; j < 8; j++) {
                    b = (byte) (((uc[i] & (0x01 << (7 - j))) >> (7 - j)) * 255);
                    for (int k = 0; k < 16; k++) {
                        pixelIndex = (i << 9) + (j << 6) + k * 2;
                        writeBuf[pixelIndex] = b;
                        writeBuf[pixelIndex + 1] = b;
                        writeBuf[pixelIndex + 2] = b;
                        writeBuf[pixelIndex + 3] = (byte) 0xFF;
                    }
                }
            }
        }

        DataBufferByte imgData = new DataBufferByte(writeBuf, sizeUncompressed);

        //SampleModel sm = new PixelInterleavedSampleModel(DataBuffer.TYPE_BYTE, c.getWidth(), c.getHeight(), 4, c.getWidth() * 4, new int[] {2, 1, 0, 3});
        SampleModel sm = new PixelInterleavedSampleModel(DataBuffer.TYPE_BYTE, getWidth(), getHeight(), 4, getWidth() * 4, ZAHLEN);
        WritableRaster imgRaster = Raster.createWritableRaster(sm, imgData, new Point(0, 0));

        BufferedImage aa = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        aa.setData(imgRaster);

        return aa;
    }
}
