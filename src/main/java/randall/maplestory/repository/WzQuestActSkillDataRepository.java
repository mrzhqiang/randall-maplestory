package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzQuestActSkillData;

public interface WzQuestActSkillDataRepository extends JpaRepository<WzQuestActSkillData, Integer>, JpaSpecificationExecutor<WzQuestActSkillData> {

}