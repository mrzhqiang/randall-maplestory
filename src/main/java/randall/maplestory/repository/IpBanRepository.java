package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.IpBan;

public interface IpBanRepository extends JpaRepository<IpBan, Integer>, JpaSpecificationExecutor<IpBan> {

}