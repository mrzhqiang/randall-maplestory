package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "aclog")
public class Aclog {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accid", nullable = false)
    private Integer accid;

    @Column(name = "bossid", nullable = false)
    private String bossid;

    @Column(name = "lastattempt", nullable = false)
    private Date lastattempt = new Date();

}
