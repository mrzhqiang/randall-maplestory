package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "loginlog")
public class LoginLog {

    @Id
    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "logintype")
    private String logintype;

    @Column(name = "ip")
    private String ip;

    @Column(name = "time")
    private String time;

    @Column(name = "active")
    private String active;

}
