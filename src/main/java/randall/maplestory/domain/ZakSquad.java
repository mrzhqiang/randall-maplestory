package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "zaksquads")
public class ZakSquad {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "channel", nullable = false)
    private Integer channel;

    @Column(name = "leaderid", nullable = false)
    private Integer leaderid = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 0;

    @Column(name = "members", nullable = false)
    private Integer members = 0;

}
