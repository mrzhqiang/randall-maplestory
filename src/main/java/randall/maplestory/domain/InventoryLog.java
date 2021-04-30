package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "inventorylog")
public class InventoryLog {

    @Id
    @Column(name = "inventorylogid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventorylogid;

    @Column(name = "inventoryitemid", nullable = false)
    private Integer inventoryitemid = 0;

    @Column(name = "msg", nullable = false)
    private String msg;

}
