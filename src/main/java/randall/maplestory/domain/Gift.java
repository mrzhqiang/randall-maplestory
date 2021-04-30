package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gifts")
public class Gift {

    @Id
    @Column(name = "giftid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer giftid;

    @Column(name = "recipient", nullable = false)
    private Integer recipient = 0;

    @Column(name = "from", nullable = false)
    private String from = "";

    @Column(name = "message", nullable = false)
    private String message = "";

    @Column(name = "sn", nullable = false)
    private Integer sn = 0;

    @Column(name = "uniqueid", nullable = false)
    private Integer uniqueid = 0;

}
