package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "queststatus")
public class QuestStatus {

    @Id
    @Column(name = "queststatusid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer queststatusid;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "quest", nullable = false)
    private Integer quest = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 0;

    @Column(name = "time", nullable = false)
    private Integer time = 0;

    @Column(name = "forfeited", nullable = false)
    private Integer forfeited = 0;

    @Column(name = "customData")
    private String customData;

}
