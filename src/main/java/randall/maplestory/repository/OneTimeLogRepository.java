package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.OneTimeLog;

public interface OneTimeLogRepository extends JpaRepository<OneTimeLog, Integer>, JpaSpecificationExecutor<OneTimeLog> {

}