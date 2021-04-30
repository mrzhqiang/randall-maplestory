package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skillmacros")
public class SkillMacro {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "position", nullable = false)
    private Integer position = 0;

    @Column(name = "skill1", nullable = false)
    private Integer skill1 = 0;

    @Column(name = "skill2", nullable = false)
    private Integer skill2 = 0;

    @Column(name = "skill3", nullable = false)
    private Integer skill3 = 0;

    @Column(name = "name")
    private String name;

    @Column(name = "shout", nullable = false)
    private Integer shout = 0;

}
