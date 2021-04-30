package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "queststatusmobs")
public class QuestStatusMob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queststatusmobid", nullable = false)
    private Integer queststatusmobid;

    @Column(name = "queststatusid", nullable = false)
    private Integer queststatusid = 0;

    @Column(name = "mob", nullable = false)
    private Integer mob = 0;

    @Column(name = "count", nullable = false)
    private Integer count = 0;

}
