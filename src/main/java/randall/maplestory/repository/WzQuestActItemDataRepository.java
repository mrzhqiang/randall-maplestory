package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestActItemData;

public interface WzQuestActItemDataRepository extends JpaRepository<WzQuestActItemData, Integer>, JpaSpecificationExecutor<WzQuestActItemData> {

}