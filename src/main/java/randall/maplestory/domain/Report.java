package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "reports")
public class Report {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "reporttime", nullable = false)
    private Date reporttime = new Date();

    @Column(name = "reporterid", nullable = false)
    private Integer reporterid;

    @Column(name = "victimid", nullable = false)
    private Integer victimid;

    @Column(name = "reason", nullable = false)
    private Integer reason;

    @Column(name = "chatlog", nullable = false)
    private String chatlog;

    @Column(name = "status", nullable = false)
    private String status;

}
