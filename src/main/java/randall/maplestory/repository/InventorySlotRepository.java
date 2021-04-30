package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.InventorySlot;

public interface InventorySlotRepository extends JpaRepository<InventorySlot, Integer>, JpaSpecificationExecutor<InventorySlot> {

}