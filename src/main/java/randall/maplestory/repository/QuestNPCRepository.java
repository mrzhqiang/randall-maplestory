package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.QuestNPC;

public interface QuestNPCRepository extends JpaRepository<QuestNPC, Integer>, JpaSpecificationExecutor<QuestNPC> {

}