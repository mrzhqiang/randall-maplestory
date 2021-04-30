package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.SkillMacro;

public interface SkillMacroRepository extends JpaRepository<SkillMacro, Integer>, JpaSpecificationExecutor<SkillMacro> {

}