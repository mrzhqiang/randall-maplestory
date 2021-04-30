package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.GMLog;

public interface GMLogRepository extends JpaRepository<GMLog, Integer>, JpaSpecificationExecutor<GMLog> {

}