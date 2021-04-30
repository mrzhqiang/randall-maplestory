package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.TrockLocation;

public interface TrockLocationRepository extends JpaRepository<TrockLocation, Integer>, JpaSpecificationExecutor<TrockLocation> {

}