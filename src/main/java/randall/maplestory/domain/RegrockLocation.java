package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "regrocklocations")
public class RegrockLocation {

    @Id
    @Column(name = "trockid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer trockid;

    @Column(name = "characterid")
    private Integer characterid;

    @Column(name = "mapid")
    private Integer mapid;

}
