package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MtsTransfer;

public interface MtsTransferRepository extends JpaRepository<MtsTransfer, Integer>, JpaSpecificationExecutor<MtsTransfer> {

}