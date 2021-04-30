package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "drop_data_vana")
public class DropDataVana {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dropperid", nullable = false)
    private Integer dropperid;

    @Column(name = "flags", nullable = false)
    private String flags = "";

    @Column(name = "itemid", nullable = false)
    private Integer itemid = 0;

    @Column(name = "minimum_quantity", nullable = false)
    private Integer minimumQuantity = 1;

    @Column(name = "maximum_quantity", nullable = false)
    private Integer maximumQuantity = 1;

    @Column(name = "questid", nullable = false)
    private Integer questid = 0;

    @Column(name = "chance", nullable = false)
    private Integer chance = 0;

}
