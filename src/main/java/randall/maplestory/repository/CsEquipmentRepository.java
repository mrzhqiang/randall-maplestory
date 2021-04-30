package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.CsEquipment;

public interface CsEquipmentRepository extends JpaRepository<CsEquipment, Integer>, JpaSpecificationExecutor<CsEquipment> {

}