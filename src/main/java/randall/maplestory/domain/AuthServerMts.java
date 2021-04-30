package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auth_server_mts")
public class AuthServerMts {

    @Id
    @Column(name = "MTSServerId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MTSServerId;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "world", nullable = false)
    private Integer world = 0;

}
