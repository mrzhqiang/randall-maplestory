package randall.maplestory.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("ms")
public class MapleStoryProperties {

    public static final String DEFAULT_WORLD_NAME = "兰达尔冒险岛";
    public static final String DEFAULT_ADDRESS = "127.0.0.1";

    public static final int DEFAULT_LOGIN_PORT = 9595;
    public static final int DEFAULT_MALL_PORT = 8600;

    public static final int DEFAULT_CHANNEL_PORT = 7575;
    public static final int DEFAULT_CHANNEL_COUNT = 3;

    public static final int DEFAULT_TIMES_EXP = 1;
    public static final int DEFAULT_TIMES_GOLD = 1;
    public static final int DEFAULT_TIMES_DROP = 1;
    public static final int DEFAULT_TIMES_BOSS_DROP = 1;
    public static final int DEFAULT_TIMES_CASH = 0;

    private String name = DEFAULT_WORLD_NAME;
    private String address = DEFAULT_ADDRESS;

    private Integer loginPort = DEFAULT_LOGIN_PORT;
    private Integer mallPort = DEFAULT_MALL_PORT;

    private Boolean debug = false;

    private Channel channel;
    private World world;

    @Getter
    @Setter
    public static class Channel {

        private Integer port = DEFAULT_CHANNEL_PORT;
        private Integer count = DEFAULT_CHANNEL_COUNT;

    }

    @Getter
    @Setter
    public static class World {

        private Times times;
        private Message message;
        private Integer flag = 3;
        private Boolean autoRegister = true;
        private Integer wFlags = 0;
        /**
         * True -- 只允许管理员登录
         */
        private Boolean adminOnly = false;
        private Integer userLimit = 100;
        private Integer maxCharacters = 3;
        private Packet packet;
        /**
         * 是否开启冒险家职业
         */
        private Boolean adventurer = true;
        /**
         * 是否开启骑士团职业
         */
        private Boolean knights = false;
        /**
         * 是否开启战神职业
         */
        private Boolean ares = false;
        private String[] events;
        private Integer[] cashban;
        private Integer[] cashjy;
        private Integer[] gysj;

    }

    /**
     * 倍率参数
     */
    @Getter
    @Setter
    public static class Times {

        private Integer exp = DEFAULT_TIMES_EXP;
        private Integer gold = DEFAULT_TIMES_GOLD;
        private Integer drop = DEFAULT_TIMES_DROP;
        private Integer bossDrop = DEFAULT_TIMES_BOSS_DROP;
        private Integer cash = DEFAULT_TIMES_CASH;

    }

    @Getter
    @Setter
    public static class Message {

        private String event;
        private String server;

    }

    @Getter
    @Setter
    public static class Packet {

        private Boolean show = false;
        private Boolean debug = false;

    }
}
