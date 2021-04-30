package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MountData;

public interface MountDataRepository extends JpaRepository<MountData, Integer>, JpaSpecificationExecutor<MountData> {

}