package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.FameLog;

public interface FameLogRepository extends JpaRepository<FameLog, Integer>, JpaSpecificationExecutor<FameLog> {

}