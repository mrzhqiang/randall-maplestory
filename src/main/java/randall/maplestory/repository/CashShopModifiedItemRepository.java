package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.CashShopModifiedItem;

public interface CashShopModifiedItemRepository extends JpaRepository<CashShopModifiedItem, Integer>, JpaSpecificationExecutor<CashShopModifiedItem> {

}