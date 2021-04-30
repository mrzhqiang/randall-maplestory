package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.QuestRequirement;

public interface QuestRequirementRepository extends JpaRepository<QuestRequirement, Integer>, JpaSpecificationExecutor<QuestRequirement> {

}