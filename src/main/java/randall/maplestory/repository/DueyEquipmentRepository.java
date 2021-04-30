package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DueyEquipment;

public interface DueyEquipmentRepository extends JpaRepository<DueyEquipment, Integer>, JpaSpecificationExecutor<DueyEquipment> {

}