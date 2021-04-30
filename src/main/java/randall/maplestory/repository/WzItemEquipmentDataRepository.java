package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzItemEquipmentData;

public interface WzItemEquipmentDataRepository extends JpaRepository<WzItemEquipmentData, Integer>, JpaSpecificationExecutor<WzItemEquipmentData> {

}