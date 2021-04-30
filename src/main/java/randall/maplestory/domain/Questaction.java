package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questactions")
public class Questaction {

    @Id
    @Column(name = "questactionid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questactionid;

    @Column(name = "questid", nullable = false)
    private Integer questid = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 0;

    @Column(name = "data", nullable = false)
    private byte[] data;

}
