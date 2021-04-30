package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "speedruns")
public class SpeedRun {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "leader", nullable = false)
    private String leader;

    @Column(name = "timestring", nullable = false)
    private String timestring;

    @Column(name = "time", nullable = false)
    private Long time = 0L;

    @Column(name = "members", nullable = false)
    private String members = "";

}
