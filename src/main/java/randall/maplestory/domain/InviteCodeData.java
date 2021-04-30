package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "invitecodedata")
public class InviteCodeData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "user")
    private String user;

    @Column(name = "time")
    private String time;

    @Column(name = "ip")
    private String ip;

    @Column(name = "active", nullable = false)
    private Integer active = 0;

}
