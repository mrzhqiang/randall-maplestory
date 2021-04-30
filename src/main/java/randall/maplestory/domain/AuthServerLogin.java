package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auth_server_login")
public class AuthServerLogin {

    @Id
    @Column(name = "loginserverid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loginserverid;

    @Column(name = "key", nullable = false)
    private String key = "";

    @Column(name = "world", nullable = false)
    private Integer world = 0;

}
