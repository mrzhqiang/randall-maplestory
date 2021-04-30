package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wz_itemdata")
public class WzItemData {

    @Id
    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "name")
    private String name;

    @Column(name = "msg")
    private String msg;

    @Column(name = "desc")
    private String desc;

    @Column(name = "slotMax", nullable = false)
    private Integer slotMax = 1;

    @Column(name = "price", nullable = false)
    private String price = "-1.0";

    @Column(name = "wholePrice", nullable = false)
    private Integer wholePrice = -1;

    @Column(name = "stateChange", nullable = false)
    private Integer stateChange = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;

    @Column(name = "karma", nullable = false)
    private Integer karma = 0;

    @Column(name = "meso", nullable = false)
    private Integer meso = 0;

    @Column(name = "monsterBook", nullable = false)
    private Integer monsterBook = 0;

    @Column(name = "itemMakeLevel", nullable = false)
    private Integer itemMakeLevel = 0;

    @Column(name = "questId", nullable = false)
    private Integer questId = 0;

    @Column(name = "scrollReqs")
    private String scrollReqs;

    @Column(name = "consumeItem")
    private String consumeItem;

    @Column(name = "totalprob", nullable = false)
    private Integer totalprob = 0;

    @Column(name = "incSkill", nullable = false)
    private String incSkill = "";

    @Column(name = "replaceid", nullable = false)
    private Integer replaceid = 0;

    @Column(name = "replacemsg", nullable = false)
    private String replacemsg = "";

    @Column(name = "create", nullable = false)
    private Integer create = 0;

    @Column(name = "afterImage", nullable = false)
    private String afterImage = "";

}
