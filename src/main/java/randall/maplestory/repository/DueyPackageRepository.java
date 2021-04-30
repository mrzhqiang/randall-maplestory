package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DueyPackage;

public interface DueyPackageRepository extends JpaRepository<DueyPackage, Integer>, JpaSpecificationExecutor<DueyPackage> {

}