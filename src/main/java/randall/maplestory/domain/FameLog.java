package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "famelog")
public class FameLog {

    @Id
    @Column(name = "famelogid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer famelogid;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "characterid_to", nullable = false)
    private Integer characteridTo = 0;

    @Column(name = "when", nullable = false)
    private Date when = new Date();

}
