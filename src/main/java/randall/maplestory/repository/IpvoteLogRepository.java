package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.IpvoteLog;

public interface IpvoteLogRepository extends JpaRepository<IpvoteLog, Integer>, JpaSpecificationExecutor<IpvoteLog> {

}