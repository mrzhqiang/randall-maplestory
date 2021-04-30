package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.RegrockLocation;

public interface RegrockLocationRepository extends JpaRepository<RegrockLocation, Integer>, JpaSpecificationExecutor<RegrockLocation> {

}