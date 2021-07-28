package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questactitemdata")
public class WzQuestActItemData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "itemid", nullable = false)
    private Integer itemid = 0;

    @Column(name = "count", nullable = false)
    private Integer count = 0;

    @Column(name = "period", nullable = false)
    private Integer period = 0;

    @Column(name = "gender", nullable = false)
    private Integer gender = 2;

    @Column(name = "job", nullable = false)
    private Integer job = -1;

    @Column(name = "jobEx", nullable = false)
    private Integer jobEx = -1;

    @Column(name = "prop", nullable = false)
    private Integer prop = -1;

//    @Column(name = "uniqueid", nullable = false)
//    private Integer uniqueid = 0;

    @ManyToOne
    @JoinColumn(name = "uniqueid", referencedColumnName = "uniqueid", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private WzQuestActData actData;
}
