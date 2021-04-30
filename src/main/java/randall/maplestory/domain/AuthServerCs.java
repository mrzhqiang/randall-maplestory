package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auth_server_cs")
public class AuthServerCs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CashShopServerId", nullable = false)
    private Integer cashShopServerId;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "world", nullable = false)
    private Integer world = 0;

}
