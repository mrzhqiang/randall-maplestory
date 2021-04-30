package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.BbsReplie;

public interface BbsReplieRepository extends JpaRepository<BbsReplie, Integer>, JpaSpecificationExecutor<BbsReplie> {

}