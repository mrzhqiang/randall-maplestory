package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_mobskilldata")
public class WzMobSkillData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "skillid", nullable = false)
    private Integer skillid;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "hp", nullable = false)
    private Integer hp = 100;

    @Column(name = "mpcon", nullable = false)
    private Integer mpcon = 0;

    @Column(name = "x", nullable = false)
    private Integer x = 1;

    @Column(name = "y", nullable = false)
    private Integer y = 1;

    @Column(name = "time", nullable = false)
    private Integer time = 0;

    @Column(name = "prop", nullable = false)
    private Integer prop = 100;

    @Column(name = "limit", nullable = false)
    private Integer limit = 0;

    @Column(name = "spawneffect", nullable = false)
    private Integer spawneffect = 0;

    @Column(name = "interval", nullable = false)
    private Integer interval = 0;

    @Column(name = "summons", nullable = false)
    private String summons = "";

    @Column(name = "ltx", nullable = false)
    private Integer ltx = 0;

    @Column(name = "lty", nullable = false)
    private Integer lty = 0;

    @Column(name = "rbx", nullable = false)
    private Integer rbx = 0;

    @Column(name = "rby", nullable = false)
    private Integer rby = 0;

    @Column(name = "once", nullable = false)
    private Integer once = 0;

}
