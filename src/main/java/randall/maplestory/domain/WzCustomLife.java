package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_customlife")
public class WzCustomLife {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dataid", nullable = false)
    private Integer dataid;

    @Column(name = "f", nullable = false)
    private Integer f;

    @Column(name = "hide", nullable = false)
    private Integer hide = 0;

    @Column(name = "fh", nullable = false)
    private Integer fh;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "cy", nullable = false)
    private Integer cy;

    @Column(name = "rx0", nullable = false)
    private Integer rx0;

    @Column(name = "rx1", nullable = false)
    private Integer rx1;

    @Column(name = "x", nullable = false)
    private Integer x;

    @Column(name = "y", nullable = false)
    private Integer y;

    @Column(name = "mobtime")
    private Integer mobtime = 1000;

    @Column(name = "mid", nullable = false)
    private Integer mid;

}
