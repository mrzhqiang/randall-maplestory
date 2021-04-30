package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Cheatlog;

public interface CheatlogRepository extends JpaRepository<Cheatlog, Integer>, JpaSpecificationExecutor<Cheatlog> {

}