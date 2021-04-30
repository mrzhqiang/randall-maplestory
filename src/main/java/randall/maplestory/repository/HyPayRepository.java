package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.HyPay;

public interface HyPayRepository extends JpaRepository<HyPay, Integer>, JpaSpecificationExecutor<HyPay> {

}