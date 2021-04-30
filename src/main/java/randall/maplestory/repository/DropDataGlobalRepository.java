package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DropDataGlobal;

public interface DropDataGlobalRepository extends JpaRepository<DropDataGlobal, Long>, JpaSpecificationExecutor<DropDataGlobal> {

}