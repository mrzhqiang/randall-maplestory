package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MacFilter;

public interface MacFilterRepository extends JpaRepository<MacFilter, Integer>, JpaSpecificationExecutor<MacFilter> {

}