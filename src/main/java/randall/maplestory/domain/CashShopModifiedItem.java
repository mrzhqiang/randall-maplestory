package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cashshop_modified_items")
public class CashShopModifiedItem {

    @Id
    @Column(name = "serial", nullable = false)
    private Integer serial;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "discount_price", nullable = false)
    private Integer discountPrice = 0;

    @Column(name = "mark", nullable = false)
    private Integer mark = -1;

    @Column(name = "showup", nullable = false)
    private Integer showup = 0;

    @Column(name = "itemid", nullable = false)
    private Integer itemid = 0;

    @Column(name = "priority", nullable = false)
    private Integer priority = 0;

    @Column(name = "package", nullable = false)
    private Integer pack = 0;

    @Column(name = "period", nullable = false)
    private Integer period = 0;

    @Column(name = "gender", nullable = false)
    private Integer gender = 0;

    @Column(name = "count", nullable = false)
    private Integer count = 0;

    @Column(name = "meso", nullable = false)
    private Integer meso = 0;

    @Column(name = "unk_1", nullable = false)
    private Integer unk1 = 0;

    @Column(name = "unk_2", nullable = false)
    private Integer unk2 = 0;

    @Column(name = "unk_3", nullable = false)
    private Integer unk3 = 0;

    @Column(name = "extra_flags", nullable = false)
    private Integer extraFlags = 0;

}
