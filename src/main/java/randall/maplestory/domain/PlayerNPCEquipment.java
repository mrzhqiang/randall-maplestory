package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "playernpcs_equip")
public class PlayerNPCEquipment {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "npcid", nullable = false)
    private Integer npcid;

    @Column(name = "equipid", nullable = false)
    private Integer equipid;

    @Column(name = "equippos", nullable = false)
    private Integer equippos;

    @Column(name = "charid", nullable = false)
    private Integer charid;

}
