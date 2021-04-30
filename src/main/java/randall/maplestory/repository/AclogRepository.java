package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Aclog;

public interface AclogRepository extends JpaRepository<Aclog, Integer>, JpaSpecificationExecutor<Aclog> {

}