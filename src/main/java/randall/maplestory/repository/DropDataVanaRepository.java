package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DropDataVana;

public interface DropDataVanaRepository extends JpaRepository<DropDataVana, Long>, JpaSpecificationExecutor<DropDataVana> {

}