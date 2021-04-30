package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.InventoryLog;

public interface InventoryLogRepository extends JpaRepository<InventoryLog, Integer>, JpaSpecificationExecutor<InventoryLog> {

}