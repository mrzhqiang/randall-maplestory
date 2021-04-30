package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gmlog")
public class GMLog {

    @Id
    @Column(name = "gmlogid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gmlogid;

    @Column(name = "cid", nullable = false)
    private Integer cid = 0;

    @Column(name = "command", nullable = false)
    private String command;

    @Column(name = "mapid", nullable = false)
    private Integer mapid = 0;

    @Column(name = "name", nullable = false)
    private String name = "無";

    @Column(name = "ip", nullable = false)
    private String ip;

}
