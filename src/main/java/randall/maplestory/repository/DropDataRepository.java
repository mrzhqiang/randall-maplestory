package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DropData;

public interface DropDataRepository extends JpaRepository<DropData, Long>, JpaSpecificationExecutor<DropData> {

}