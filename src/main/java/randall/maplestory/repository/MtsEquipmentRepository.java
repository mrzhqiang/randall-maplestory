package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MtsEquipment;

public interface MtsEquipmentRepository extends JpaRepository<MtsEquipment, Integer>, JpaSpecificationExecutor<MtsEquipment> {

}