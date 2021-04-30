package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.QuestInfo;

public interface QuestInfoRepository extends JpaRepository<QuestInfo, Integer>, JpaSpecificationExecutor<QuestInfo> {

}