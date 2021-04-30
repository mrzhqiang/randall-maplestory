package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.LoginLog;

public interface LoginLogRepository extends JpaRepository<LoginLog, Void>, JpaSpecificationExecutor<LoginLog> {

}