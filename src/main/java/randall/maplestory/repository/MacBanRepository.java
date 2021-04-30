package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MacBan;

public interface MacBanRepository extends JpaRepository<MacBan, Integer>, JpaSpecificationExecutor<MacBan> {

}