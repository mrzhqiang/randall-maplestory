package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzOxData;

public interface WzOxDataRepository extends JpaRepository<WzOxData, Integer>, JpaSpecificationExecutor<WzOxData> {

}