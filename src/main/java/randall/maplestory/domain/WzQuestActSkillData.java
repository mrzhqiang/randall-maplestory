package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questactskilldata")
public class WzQuestActSkillData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "skillid", nullable = false)
    private Integer skillid = 0;

    @Column(name = "skillLevel", nullable = false)
    private Integer skillLevel = -1;

    @Column(name = "masterLevel", nullable = false)
    private Integer masterLevel = -1;

//    @Column(name = "uniqueid", nullable = false)
//    private Integer uniqueid = 0;

    @ManyToOne
    @JoinColumn(name = "uniqueid", referencedColumnName = "uniqueid", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private WzQuestActData actData;
}
