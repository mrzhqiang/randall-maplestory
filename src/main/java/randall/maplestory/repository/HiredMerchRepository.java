package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.HiredMerch;

public interface HiredMerchRepository extends JpaRepository<HiredMerch, Integer>, JpaSpecificationExecutor<HiredMerch> {

}