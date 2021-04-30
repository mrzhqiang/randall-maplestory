package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_itemequipdata")
public class WzItemEquipmentData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "itemLevel", nullable = false)
    private Integer itemLevel = -1;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "value", nullable = false)
    private Integer value = 0;

}
