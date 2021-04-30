package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bosslog")
public class BossLog {

    @Id
    @Column(name = "bosslogid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bosslogid;

    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "bossid", nullable = false)
    private String bossid;

    @Column(name = "lastattempt", nullable = false)
    private Date lastattempt = new Date();

}
