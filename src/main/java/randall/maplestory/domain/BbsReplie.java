package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bbs_replies")
public class BbsReplie {

    @Id
    @Column(name = "replyid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer replyid;

    @ManyToOne(optional = false)
    @JoinColumn(name = "threadid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private BbsThread thread;

    @Column(name = "postercid", nullable = false)
    private Integer postercid;

    @Column(name = "timestamp", nullable = false)
    private Long timestamp;

    @Column(name = "content", nullable = false)
    private String content = "";

    @ManyToOne
    @JoinColumn(name = "guildid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Guild guild;

}
