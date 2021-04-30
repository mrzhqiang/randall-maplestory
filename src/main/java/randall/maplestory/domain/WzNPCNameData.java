package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_npcnamedata")
public class WzNPCNameData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "npc", nullable = false)
    private Integer npc;

    @Column(name = "name", nullable = false)
    private String name;

}
