package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rings")
public class Ring {

    @Id
    @Column(name = "ringid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ringid;

    @Column(name = "partnerRingId", nullable = false)
    private Integer partnerRingId = 0;

    @Column(name = "partnerChrId", nullable = false)
    private Integer partnerChrId = 0;

    @Column(name = "itemid", nullable = false)
    private Integer itemid = 0;

    @Column(name = "partnername", nullable = false)
    private String partnername;

}
