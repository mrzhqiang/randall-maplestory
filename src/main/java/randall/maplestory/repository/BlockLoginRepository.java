package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.BlockLogin;

public interface BlockLoginRepository extends JpaRepository<BlockLogin, Void>, JpaSpecificationExecutor<BlockLogin> {

}