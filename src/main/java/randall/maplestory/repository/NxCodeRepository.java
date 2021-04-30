package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.NxCode;

public interface NxCodeRepository extends JpaRepository<NxCode, String>, JpaSpecificationExecutor<NxCode> {

}