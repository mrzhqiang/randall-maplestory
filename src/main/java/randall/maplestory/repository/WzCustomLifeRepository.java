package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzCustomLife;

public interface WzCustomLifeRepository extends JpaRepository<WzCustomLife, Integer>, JpaSpecificationExecutor<WzCustomLife> {

}