package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.HiredMerchItem;

public interface HiredMerchItemRepository extends JpaRepository<HiredMerchItem, Integer>, JpaSpecificationExecutor<HiredMerchItem> {

}