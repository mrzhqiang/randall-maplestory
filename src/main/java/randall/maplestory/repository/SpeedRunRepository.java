package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.SpeedRun;

public interface SpeedRunRepository extends JpaRepository<SpeedRun, Integer>, JpaSpecificationExecutor<SpeedRun> {

}