package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skills_cooldowns")
public class SkillCooldown {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "charid", nullable = false)
    private Integer charid;

    @Column(name = "SkillID", nullable = false)
    private Integer skillID;

    @Column(name = "length", nullable = false)
    private Long length;

    @Column(name = "StartTime", nullable = false)
    private Long startTime;

}
