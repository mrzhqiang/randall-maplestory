package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.InventoryEquipment;

public interface InventoryEquipmentRepository extends JpaRepository<InventoryEquipment, Integer>, JpaSpecificationExecutor<InventoryEquipment> {

}