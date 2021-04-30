package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MulungDojo;

public interface MulungDojoRepository extends JpaRepository<MulungDojo, Integer>, JpaSpecificationExecutor<MulungDojo> {

}