package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ipbans")
public class IpBan {

    @Id
    @Column(name = "ipbanid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ipbanid;

    @Column(name = "ip", nullable = false)
    private String ip = "";

}
