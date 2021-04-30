package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.FishingReward;

public interface FishingRewardRepository extends JpaRepository<FishingReward, Void>, JpaSpecificationExecutor<FishingReward> {

}