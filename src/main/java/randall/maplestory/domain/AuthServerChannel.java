package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auth_server_channel")
public class AuthServerChannel {

    @Id
    @Column(name = "channelid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer channelid;

    @Column(name = "world", nullable = false)
    private Integer world = 0;

    @Column(name = "number")
    private Integer number;

    @Column(name = "key", nullable = false)
    private String key = "";

}
