package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Buddie;

public interface BuddieRepository extends JpaRepository<Buddie, Integer>, JpaSpecificationExecutor<Buddie> {

}