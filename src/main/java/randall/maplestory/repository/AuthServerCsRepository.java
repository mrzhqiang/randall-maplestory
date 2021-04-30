package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.AuthServerCs;

public interface AuthServerCsRepository extends JpaRepository<AuthServerCs, Integer>, JpaSpecificationExecutor<AuthServerCs> {

}