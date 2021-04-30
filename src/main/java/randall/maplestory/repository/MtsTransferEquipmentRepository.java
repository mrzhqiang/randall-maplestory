package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MtsTransferEquipment;

public interface MtsTransferEquipmentRepository extends JpaRepository<MtsTransferEquipment, Integer>, JpaSpecificationExecutor<MtsTransferEquipment> {

}