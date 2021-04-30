package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzItemRewardData;

public interface WzItemRewardDataRepository extends JpaRepository<WzItemRewardData, Integer>, JpaSpecificationExecutor<WzItemRewardData> {

}