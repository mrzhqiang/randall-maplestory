package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.AuthServerChannelIp;

public interface AuthServerChannelIpRepository extends JpaRepository<AuthServerChannelIp, Integer>, JpaSpecificationExecutor<AuthServerChannelIp> {

}