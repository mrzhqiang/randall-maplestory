package randall.maplestory.account;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "2ndpassword")
    private String secondPassword;

    @Column(name = "salt2")
    private String salt2;

    @Column(name = "loggedin", nullable = false)
    private Integer loggedIn = 0;

    @Column(name = "lastlogin")
    private Date lastLogin;

    @Column(name = "createdat", nullable = false)
    private Date createDate = new Date();

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "banned", nullable = false)
    private Integer banned = 0;

    @Column(name = "banreason")
    private String banReason;

    @Column(name = "gm", nullable = false)
    private Integer gm = 0;

    @Column(name = "email")
    private String email;

    @Column(name = "macs")
    private String macs;

    @Column(name = "tempban", nullable = false)
    private Date tempBan = new Date(1619280000000L);

    @Column(name = "greason")
    private Integer greason;

    @Column(name = "ACash")
    private Integer ACash = 0;

    @Column(name = "mPoints")
    private Integer mPoints;

    @Column(name = "gender", nullable = false)
    private Integer gender = 10;

    @Column(name = "SessionIP")
    private String sessionIP;

    @Column(name = "points", nullable = false)
    private Integer points = 0;

    @Column(name = "vpoints", nullable = false)
    private Integer vpoints = 0;

    @Column(name = "lastlogon")
    private Date lastlogon;

    @Column(name = "facebook_id")
    private String facebookId;

    @Column(name = "access_token")
    private String accessToken = "";

    @Column(name = "password_otp")
    private String passwordOtp = "";

    @Column(name = "expiration")
    private Date expiration;

    @Column(name = "VIP")
    private Integer VIP;

    @Column(name = "money", nullable = false)
    private Integer money = 0;

    @Column(name = "moneyb", nullable = false)
    private Integer moneyb = 0;

    @Column(name = "lastgainhm", nullable = false)
    private Long lastGainHM = 0L;

    @Column(name = "paypalNX")
    private Integer paypalNX = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Account account = (Account) o;

        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
