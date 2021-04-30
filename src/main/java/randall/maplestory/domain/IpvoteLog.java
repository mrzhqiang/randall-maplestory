package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ipvotelog")
public class IpvoteLog {

    @Id
    @Column(name = "vid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vid;

    @Column(name = "accid", nullable = false)
    private String accid = "0";

    @Column(name = "ipaddress", nullable = false)
    private String ipaddress = "127.0.0.1";

    @Column(name = "votetime", nullable = false)
    private String votetime = "0";

    @Column(name = "votetype", nullable = false)
    private Integer votetype = 0;

}
