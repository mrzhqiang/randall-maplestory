package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventoryslot")
public class InventorySlot {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid")
    private Integer characterid;

    @Column(name = "equip")
    private Integer equip;

    @Column(name = "use")
    private Integer use;

    @Column(name = "setup")
    private Integer setup;

    @Column(name = "etc")
    private Integer etc;

    @Column(name = "cash")
    private Integer cash;

}
