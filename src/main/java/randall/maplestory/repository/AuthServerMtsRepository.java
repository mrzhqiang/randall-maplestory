package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.AuthServerMts;

public interface AuthServerMtsRepository extends JpaRepository<AuthServerMts, Integer>, JpaSpecificationExecutor<AuthServerMts> {

}