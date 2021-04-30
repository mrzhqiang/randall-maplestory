package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.QuestStatusMob;

public interface QuestStatusMobRepository extends JpaRepository<QuestStatusMob, Integer>, JpaSpecificationExecutor<QuestStatusMob> {

}