package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Ring;

public interface RingRepository extends JpaRepository<Ring, Integer>, JpaSpecificationExecutor<Ring> {

}