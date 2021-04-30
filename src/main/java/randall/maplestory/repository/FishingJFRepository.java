package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.FishingJF;

public interface FishingJFRepository extends JpaRepository<FishingJF, Integer>, JpaSpecificationExecutor<FishingJF> {

}