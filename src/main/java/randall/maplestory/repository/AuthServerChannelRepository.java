package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.AuthServerChannel;

public interface AuthServerChannelRepository extends JpaRepository<AuthServerChannel, Integer>, JpaSpecificationExecutor<AuthServerChannel> {

}