package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.QuestMonster;

public interface QuestMonsterRepository extends JpaRepository<QuestMonster, Integer>, JpaSpecificationExecutor<QuestMonster> {

}