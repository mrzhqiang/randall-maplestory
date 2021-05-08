package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "alliances")
public class Alliance {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "leaderid", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Character leaderid;

    @Column(name = "guild1", nullable = false)
    private Integer guild1;

    @Column(name = "guild2", nullable = false)
    private Integer guild2;

    @Column(name = "guild3", nullable = false)
    private Integer guild3 = 0;

    @Column(name = "guild4", nullable = false)
    private Integer guild4 = 0;

    @Column(name = "guild5", nullable = false)
    private Integer guild5 = 0;

    @Column(name = "rank1", nullable = false)
    private String rank1 = "公會長";

    @Column(name = "rank2", nullable = false)
    private String rank2 = "公會副會長";

    @Column(name = "rank3", nullable = false)
    private String rank3 = "公會成員";

    @Column(name = "rank4", nullable = false)
    private String rank4 = "公會成員";

    @Column(name = "rank5", nullable = false)
    private String rank5 = "公會成員";

    @Column(name = "capacity", nullable = false)
    private Integer capacity = 2;

    @Column(name = "notice", nullable = false)
    private String notice = "";

}
