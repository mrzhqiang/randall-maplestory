package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.UseLog;

public interface UseLogRepository extends JpaRepository<UseLog, Void>, JpaSpecificationExecutor<UseLog> {

}