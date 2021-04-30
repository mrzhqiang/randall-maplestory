package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.PlayerNPCEquipment;

public interface PlayerNPCEquipmentRepository extends JpaRepository<PlayerNPCEquipment, Integer>, JpaSpecificationExecutor<PlayerNPCEquipment> {

}