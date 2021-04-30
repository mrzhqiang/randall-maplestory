package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.EventStat;

public interface EventStatRepository extends JpaRepository<EventStat, Integer>, JpaSpecificationExecutor<EventStat> {

}