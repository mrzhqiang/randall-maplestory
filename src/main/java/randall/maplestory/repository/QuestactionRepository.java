package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Questaction;

public interface QuestactionRepository extends JpaRepository<Questaction, Integer>, JpaSpecificationExecutor<Questaction> {

}