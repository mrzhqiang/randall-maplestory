package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzMobSkillData;

public interface WzMobSkillDataRepository extends JpaRepository<WzMobSkillData, Integer>, JpaSpecificationExecutor<WzMobSkillData> {

}