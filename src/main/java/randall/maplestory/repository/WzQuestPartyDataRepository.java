package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestPartyData;

public interface WzQuestPartyDataRepository extends JpaRepository<WzQuestPartyData, Integer>, JpaSpecificationExecutor<WzQuestPartyData> {

}