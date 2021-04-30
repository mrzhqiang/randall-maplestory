package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.CashShopLimitSell;

public interface CashShopLimitSellRepository extends JpaRepository<CashShopLimitSell, Integer>, JpaSpecificationExecutor<CashShopLimitSell> {

}