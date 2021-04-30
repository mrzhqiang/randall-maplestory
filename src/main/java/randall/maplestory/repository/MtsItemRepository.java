package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Mtsitem;

public interface MtsItemRepository extends JpaRepository<Mtsitem, Integer>, JpaSpecificationExecutor<Mtsitem> {

}