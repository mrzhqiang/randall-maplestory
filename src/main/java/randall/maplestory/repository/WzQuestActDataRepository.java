package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestActData;

public interface WzQuestActDataRepository extends JpaRepository<WzQuestActData, Integer>, JpaSpecificationExecutor<WzQuestActData> {

}