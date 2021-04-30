package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auth_server_channel_ip")
public class AuthServerChannelIp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channelconfigid", nullable = false)
    private Integer channelconfigid;

    @Column(name = "channelid", nullable = false)
    private Integer channelid = 0;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "value", nullable = false)
    private String value;

}
