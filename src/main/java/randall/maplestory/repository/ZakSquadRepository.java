package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.ZakSquad;

public interface ZakSquadRepository extends JpaRepository<ZakSquad, Integer>, JpaSpecificationExecutor<ZakSquad> {

}