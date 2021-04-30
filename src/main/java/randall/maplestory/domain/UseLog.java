package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "uselog")
public class UseLog {

    @Id
    @Column(name = "account")
    private String account;

    @Column(name = "ip")
    private String ip;

    @Column(name = "time")
    private String time;

    @Column(name = "usetype")
    private String usetype;

    @Column(name = "active")
    private String active;

    @Column(name = "newpassword")
    private String newpassword;

    @Column(name = "oldpassword")
    private String oldpassword;

}
