package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Gift;

public interface GiftRepository extends JpaRepository<Gift, Integer>, JpaSpecificationExecutor<Gift> {

}