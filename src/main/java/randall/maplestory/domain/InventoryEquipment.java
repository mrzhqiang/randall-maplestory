package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventoryequipment")
public class InventoryEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventoryequipmentid", nullable = false)
    private Integer inventoryequipmentid;

    @Column(name = "inventoryitemid", nullable = false)
    private Integer inventoryitemid = 0;

    @Column(name = "upgradeslots", nullable = false)
    private Integer upgradeslots = 0;

    @Column(name = "level", nullable = false)
    private Integer level = 0;

    @Column(name = "str", nullable = false)
    private Integer str = 0;

    @Column(name = "dex", nullable = false)
    private Integer dex = 0;

    @Column(name = "int", nullable = false)
    private Integer intelligence =0;

    @Column(name = "luk", nullable = false)
    private Integer luk = 0;

    @Column(name = "hp", nullable = false)
    private Integer hp = 0;

    @Column(name = "mp", nullable = false)
    private Integer mp = 0;

    @Column(name = "watk", nullable = false)
    private Integer watk = 0;

    @Column(name = "matk", nullable = false)
    private Integer matk = 0;

    @Column(name = "wdef", nullable = false)
    private Integer wdef = 0;

    @Column(name = "mdef", nullable = false)
    private Integer mdef = 0;

    @Column(name = "acc", nullable = false)
    private Integer acc = 0;

    @Column(name = "avoid", nullable = false)
    private Integer avoid = 0;

    @Column(name = "hands", nullable = false)
    private Integer hands = 0;

    @Column(name = "speed", nullable = false)
    private Integer speed = 0;

    @Column(name = "jump", nullable = false)
    private Integer jump = 0;

    @Column(name = "ViciousHammer", nullable = false)
    private Integer viciousHammer = 0;

    @Column(name = "itemEXP", nullable = false)
    private Integer itemEXP = 0;

    @Column(name = "durability", nullable = false)
    private Integer durability = -1;

    @Column(name = "enhance", nullable = false)
    private Integer enhance = 0;

    @Column(name = "potential1", nullable = false)
    private Integer potential1 = 0;

    @Column(name = "potential2", nullable = false)
    private Integer potential2 = 0;

    @Column(name = "potential3", nullable = false)
    private Integer potential3 = 0;

    @Column(name = "hpR", nullable = false)
    private Integer hpR = 0;

    @Column(name = "mpR", nullable = false)
    private Integer mpR = 0;

    @Column(name = "itemlevel", nullable = false)
    private Integer itemlevel;

}
