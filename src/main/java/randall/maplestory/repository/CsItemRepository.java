package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.CsItem;

public interface CsItemRepository extends JpaRepository<CsItem, Integer>, JpaSpecificationExecutor<CsItem> {

}