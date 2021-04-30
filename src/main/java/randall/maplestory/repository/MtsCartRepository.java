package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MtsCart;

public interface MtsCartRepository extends JpaRepository<MtsCart, Integer>, JpaSpecificationExecutor<MtsCart> {

}