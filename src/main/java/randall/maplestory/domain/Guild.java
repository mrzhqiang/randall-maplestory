package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Data
@Entity
@Table(name = "guilds")
public class Guild {

    @Id
    @Column(name = "guildid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guildid;

    @OneToOne(optional = false)
    @JoinColumn(name = "leader", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Character leader;

    @OneToMany(mappedBy = "guild")
    @OrderBy("guildrank ASC, name ASC")
    private List<Character> members = Collections.emptyList();

    @OneToMany(mappedBy = "guild")
    @OrderBy("localthreadid DESC")
    private List<BbsThread> threads;

    @Column(name = "GP", nullable = false)
    private Integer GP = 0;

    @Column(name = "logo")
    private Integer logo;

    @Column(name = "logocolor", nullable = false)
    private Integer logoColor = 0;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "rank1title", nullable = false)
    private String rank1title = "公會長";

    @Column(name = "rank2title", nullable = false)
    private String rank2title = "公會副會長";

    @Column(name = "rank3title", nullable = false)
    private String rank3title = "公會成員";

    @Column(name = "rank4title", nullable = false)
    private String rank4title = "公會成員";

    @Column(name = "rank5title", nullable = false)
    private String rank5title = "公會成員";

    @Column(name = "capacity", nullable = false)
    private Integer capacity = 10;

    @Column(name = "logoBG")
    private Integer logoBG;

    @Column(name = "logoBGColor", nullable = false)
    private Integer logoBGColor = 0;

    @Column(name = "notice")
    private String notice;

    @Column(name = "signature", nullable = false)
    private Integer signature = 0;

    @Column(name = "alliance", nullable = false)
    private Integer alliance = 0;

}
