package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.PlayerNPC;

public interface PlayerNPCRepository extends JpaRepository<PlayerNPC, Integer>, JpaSpecificationExecutor<PlayerNPC> {

}