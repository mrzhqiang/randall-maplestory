package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzNPCNameData;

public interface WzNPCNameDataRepository extends JpaRepository<WzNPCNameData, Integer>, JpaSpecificationExecutor<WzNPCNameData> {

}