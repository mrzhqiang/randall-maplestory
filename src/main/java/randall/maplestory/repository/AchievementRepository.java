package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement, Integer>, JpaSpecificationExecutor<Achievement> {

}