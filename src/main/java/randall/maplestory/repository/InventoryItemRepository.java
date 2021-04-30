package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer>, JpaSpecificationExecutor<InventoryItem> {

}