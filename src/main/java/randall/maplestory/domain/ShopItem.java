package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shopitems")
public class ShopItem {

    @Id
    @Column(name = "shopitemid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopitemid;

    @Column(name = "shopid", nullable = false)
    private Integer shopid;

    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "pitch", nullable = false)
    private Integer pitch = 0;

    /**
     * sort is an arbitrary field designed to give leeway when modifying shops. The lowest number is 104 and it increments by 4 for each item to allow decent space for swapping/inserting/removing items.
     */
    @Column(name = "position", nullable = false)
    private Integer position;

    @Column(name = "reqitem")
    private Integer reqitem;

    @Column(name = "reqitemq")
    private Integer reqitemq;

}
