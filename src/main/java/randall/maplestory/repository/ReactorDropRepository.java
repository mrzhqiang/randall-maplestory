package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.ReactorDrop;

public interface ReactorDropRepository extends JpaRepository<ReactorDrop, Integer>, JpaSpecificationExecutor<ReactorDrop> {

}