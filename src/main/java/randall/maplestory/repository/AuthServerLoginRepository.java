package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.AuthServerLogin;

public interface AuthServerLoginRepository extends JpaRepository<AuthServerLogin, Integer>, JpaSpecificationExecutor<AuthServerLogin> {

}