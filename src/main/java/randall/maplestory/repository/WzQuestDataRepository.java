package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestData;

public interface WzQuestDataRepository extends JpaRepository<WzQuestData, Integer>, JpaSpecificationExecutor<WzQuestData> {

}