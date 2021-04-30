package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dueyitems")
public class DueyItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventoryitemid", nullable = false)
    private Integer inventoryitemid;

    @Column(name = "characterid")
    private Integer characterid;

    @Column(name = "accountid")
    private Integer accountid;

    @Column(name = "packageid")
    private Integer packageid;

    @Column(name = "itemid", nullable = false)
    private Integer itemid = 0;

    @Column(name = "inventorytype", nullable = false)
    private Integer inventorytype = 0;

    @Column(name = "position", nullable = false)
    private Integer position = 0;

    @Column(name = "quantity", nullable = false)
    private Integer quantity = 0;

    @Column(name = "owner")
    private String owner;

    @Column(name = "GM_Log")
    private String gmLog;

    @Column(name = "uniqueid", nullable = false)
    private Integer uniqueid = -1;

    @Column(name = "flag", nullable = false)
    private Integer flag = 0;

    @Column(name = "expiredate", nullable = false)
    private Long expiredate = -1L;

    @Column(name = "type", nullable = false)
    private Integer type = 0;

    @Column(name = "sender", nullable = false)
    private String sender = "";

}
