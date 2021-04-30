package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "eventstats")
public class EventStat {

    @Id
    @Column(name = "eventstatid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventstatid;

    @Column(name = "event", nullable = false)
    private String event;

    @Column(name = "instance", nullable = false)
    private String instance;

    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "channel", nullable = false)
    private Integer channel;

    @Column(name = "time", nullable = false)
    private Date time = new Date();

}
