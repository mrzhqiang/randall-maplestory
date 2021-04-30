package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "blocklogin")
public class BlockLogin {

    @Id
    @Column(name = "account")
    private String account;

    @Column(name = "blocktime")
    private String blocktime;

    @Column(name = "unblocktime")
    private String unblocktime;

    @Column(name = "ip")
    private String ip;

    @Column(name = "active")
    private String active;

}
