package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "fishing_rewards")
public class FishingReward {

    @Id
    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "chance", nullable = false)
    private Integer chance;

    @Column(name = "expiration")
    private Integer expiration = 0;

    @Column(name = "name")
    private String name = "";

}
