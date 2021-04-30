package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fishingjf")
public class FishingJF {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accname", nullable = false)
    private String accname = "";

    @Column(name = "fishing", nullable = false)
    private Integer fishing = 0;

    @Column(name = "XX", nullable = false)
    private Integer XX = 0;

    @Column(name = "XXX", nullable = false)
    private Integer XXX = 0;

}
