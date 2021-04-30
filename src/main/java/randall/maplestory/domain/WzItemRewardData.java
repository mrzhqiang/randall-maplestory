package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_itemrewarddata")
public class WzItemRewardData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "item", nullable = false)
    private Integer item;

    @Column(name = "prob", nullable = false)
    private Integer prob = 0;

    @Column(name = "quantity", nullable = false)
    private Integer quantity = 0;

    @Column(name = "period", nullable = false)
    private Integer period = -1;

    @Column(name = "worldMsg", nullable = false)
    private String worldMsg = "";

    @Column(name = "effect", nullable = false)
    private String effect = "";

}
