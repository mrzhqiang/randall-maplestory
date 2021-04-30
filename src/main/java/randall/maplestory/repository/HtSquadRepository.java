package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.HtSquad;

public interface HtSquadRepository extends JpaRepository<HtSquad, Integer>, JpaSpecificationExecutor<HtSquad> {

}