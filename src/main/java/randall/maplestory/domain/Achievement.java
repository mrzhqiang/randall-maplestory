package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "achievements")
@IdClass(Achievement.AchievementId.class)
public class Achievement implements Serializable {

    @Id
    @Column(name = "achievementid", nullable = false)
    private Integer achievementid = 0;

    @Id
    @Column(name = "charid", nullable = false)
    private Integer charid = 0;

    @Column(name = "accountid", nullable = false)
    private Integer accountid = 0;

    public static class AchievementId implements Serializable {
        public Integer achievementid;
        public Integer charid;
    }
}
