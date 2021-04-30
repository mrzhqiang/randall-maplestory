package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "prizelog")
public class PrizeLog {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accid", nullable = false)
    private Integer accid;

    @Column(name = "bossid", nullable = false)
    private String bossid;

}
