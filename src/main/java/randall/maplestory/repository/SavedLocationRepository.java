package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.SavedLocation;

public interface SavedLocationRepository extends JpaRepository<SavedLocation, Integer>, JpaSpecificationExecutor<SavedLocation> {

}