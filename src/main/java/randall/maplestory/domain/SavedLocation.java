package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "savedlocations")
public class SavedLocation {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "locationtype", nullable = false)
    private Integer locationtype = 0;

    @Column(name = "map", nullable = false)
    private Integer map;

}
