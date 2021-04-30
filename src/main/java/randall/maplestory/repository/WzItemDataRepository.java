package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzItemData;

public interface WzItemDataRepository extends JpaRepository<WzItemData, Integer>, JpaSpecificationExecutor<WzItemData> {

}