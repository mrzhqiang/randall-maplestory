package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questnpc")
public class QuestNPC {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "npcid")
    private Integer npcid;

    @Column(name = "itemid")
    private Integer itemid;

    @Column(name = "sl")
    private Integer sl = 0;

    @Column(name = "zt")
    private Integer zt;

    @Column(name = "name")
    private String name;

    @Column(name = "item")
    private Integer item;

    @Column(name = "itemsl")
    private Integer itemsl;

    @Column(name = "money")
    private Integer money;

}
