package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reactordrops")
public class ReactorDrop {

    @Id
    @Column(name = "reactordropid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reactordropid;

    @Column(name = "reactorid", nullable = false)
    private Integer reactorid;

    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "chance", nullable = false)
    private Integer chance;

    @Column(name = "questid", nullable = false)
    private Integer questid = -1;

}
