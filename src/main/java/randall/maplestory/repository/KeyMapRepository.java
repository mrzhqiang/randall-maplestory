package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.KeyMap;

public interface KeyMapRepository extends JpaRepository<KeyMap, Integer>, JpaSpecificationExecutor<KeyMap> {

}