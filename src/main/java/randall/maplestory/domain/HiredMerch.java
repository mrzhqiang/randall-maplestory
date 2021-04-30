package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hiredmerch")
public class HiredMerch {

    @Id
    @Column(name = "PackageId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer packageId;

    @Column(name = "characterid")
    private Integer characterid = 0;

    @Column(name = "accountid")
    private Integer accountid;

    @Column(name = "map", nullable = false)
    private Integer map = 0;

    @Column(name = "channel")
    private Integer channel = 0;

    @Column(name = "Mesos")
    private Integer mesos = 0;

    @Column(name = "time")
    private Long time;

}
