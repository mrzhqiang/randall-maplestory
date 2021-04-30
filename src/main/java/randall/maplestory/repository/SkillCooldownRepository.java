package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.SkillCooldown;

public interface SkillCooldownRepository extends JpaRepository<SkillCooldown, Integer>, JpaSpecificationExecutor<SkillCooldown> {

}