package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.HiredMerchEquipment;

public interface HiredMerchEquipmentRepository extends JpaRepository<HiredMerchEquipment, Integer>, JpaSpecificationExecutor<HiredMerchEquipment> {

}