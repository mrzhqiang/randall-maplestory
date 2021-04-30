package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questinfo")
public class QuestInfo {

    @Id
    @Column(name = "questinfoid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questinfoid;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "quest", nullable = false)
    private Integer quest = 0;

    @Column(name = "customData")
    private String customData;

}
