package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestActQuestData;

public interface WzQuestActQuestDataRepository extends JpaRepository<WzQuestActQuestData, Integer>, JpaSpecificationExecutor<WzQuestActQuestData> {

}