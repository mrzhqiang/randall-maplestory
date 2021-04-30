package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "skillid", nullable = false)
    private Integer skillid = 0;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "skilllevel", nullable = false)
    private Integer skilllevel = 0;

    @Column(name = "masterlevel", nullable = false)
    private Integer masterlevel = 0;

    @Column(name = "expiration", nullable = false)
    private Long expiration = -1L;

}
