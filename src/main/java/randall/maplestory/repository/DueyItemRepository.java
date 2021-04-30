package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.DueyItem;

public interface DueyItemRepository extends JpaRepository<DueyItem, Integer>, JpaSpecificationExecutor<DueyItem> {

}