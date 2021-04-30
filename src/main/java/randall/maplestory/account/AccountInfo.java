package randall.maplestory.account;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "accounts_info")
public class AccountInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accId", nullable = false)
    private Integer accId = 0;

    @Column(name = "worldId", nullable = false)
    private Integer worldId = 0;

    @Column(name = "cardSlots", nullable = false)
    private Integer cardSlots = 3;

    /**
     * 在线时间点
     */
    @Column(name = "gamePoints", nullable = false)
    private Integer gamePoints = 0;

    /**
     * 时间戳
     */
    @Column(name = "updateTime")
    private Date updateTime;

    @Column(name = "gamePointspd", nullable = false)
    private Integer gamePointspd = 0;

    @Column(name = "gamePointsps", nullable = false)
    private Integer gamePointsps = 0;

    @Column(name = "sjrw", nullable = false)
    private Integer sjrw = 0;

    @Column(name = "sgrw", nullable = false)
    private Integer sgrw = 0;

    @Column(name = "fbrw")
    private Integer fbrw = 0;

    @Column(name = "sbossrw")
    private Integer sbossrw = 0;

    @Column(name = "sgrwa")
    private Integer sgrwa = 0;

    @Column(name = "fbrwa")
    private Integer fbrwa = 0;

    @Column(name = "sbossrwa")
    private Integer sbossrwa = 0;

    @Column(name = "lb")
    private Integer lb = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountInfo that = (AccountInfo) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
