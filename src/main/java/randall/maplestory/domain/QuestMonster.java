package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questmonster")
public class QuestMonster {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "questid")
    private Integer questid;

    @Column(name = "monsterid")
    private Integer monsterid;

    @Column(name = "zt", nullable = false)
    private Integer zt;

    @Column(name = "charid")
    private Integer charid;

    @Column(name = "name")
    private String name = "";

}
