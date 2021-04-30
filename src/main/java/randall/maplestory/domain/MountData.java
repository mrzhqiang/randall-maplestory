package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mountdata")
public class MountData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid")
    private Integer characterid;

    @Column(name = "Level", nullable = false)
    private Integer level = 0;

    @Column(name = "Exp", nullable = false)
    private Integer exp = 0;

    @Column(name = "Fatigue", nullable = false)
    private Integer fatigue = 0;

}
