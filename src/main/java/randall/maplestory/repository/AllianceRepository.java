package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Alliance;

public interface AllianceRepository extends JpaRepository<Alliance, Integer>, JpaSpecificationExecutor<Alliance> {

}