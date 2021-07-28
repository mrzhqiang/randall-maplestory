package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questactquestdata")
public class WzQuestActQuestData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "quest", nullable = false)
    private Integer quest = 0;

    @Column(name = "state", nullable = false)
    private Integer state = 2;

//    @Column(name = "uniqueid", nullable = false)
//    private Integer uniqueid = 0;

    @ManyToOne
    @JoinColumn(name = "uniqueid", referencedColumnName = "uniqueid", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private WzQuestActData actData;
}
