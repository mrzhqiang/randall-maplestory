package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.BbsThread;

public interface BbsThreadRepository extends JpaRepository<BbsThread, Integer>, JpaSpecificationExecutor<BbsThread> {

}