package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "bbs_threads")
public class BbsThread {

    @Id
    @Column(name = "threadid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer threadid;

    @Column(name = "postercid", nullable = false)
    private Integer postercid;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "timestamp", nullable = false)
    private Long timestamp;

    @Column(name = "icon", nullable = false)
    private Integer icon;

    @Column(name = "startpost", nullable = false)
    private String startpost;

    @ManyToOne(optional = false)
    @JoinColumn(name = "guildid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Guild guild;

    @Column(name = "localthreadid", nullable = false)
    private Integer localthreadid;

    @OneToMany(mappedBy = "thread", fetch = FetchType.EAGER)
    private List<BbsReplie> replies;
}
