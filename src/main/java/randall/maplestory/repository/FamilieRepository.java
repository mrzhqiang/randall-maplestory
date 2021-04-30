package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Familie;

public interface FamilieRepository extends JpaRepository<Familie, Integer>, JpaSpecificationExecutor<Familie> {

}