package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cheatlog")
public class Cheatlog {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "offense", nullable = false)
    private String offense;

    @Column(name = "count", nullable = false)
    private Integer count = 0;

    @Column(name = "lastoffensetime", nullable = false)
    private Date lastoffensetime = new Date();

    @Column(name = "param", nullable = false)
    private String param;

}
