package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "buddies")
public class Buddie {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "buddyid", nullable = false)
    private Integer buddyid;

    @Column(name = "pending", nullable = false)
    private Integer pending = 0;

    @Column(name = "groupname", nullable = false)
    private String groupname = "其他";

}
