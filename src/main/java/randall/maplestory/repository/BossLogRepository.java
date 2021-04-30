package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.BossLog;

public interface BossLogRepository extends JpaRepository<BossLog, Integer>, JpaSpecificationExecutor<BossLog> {

}