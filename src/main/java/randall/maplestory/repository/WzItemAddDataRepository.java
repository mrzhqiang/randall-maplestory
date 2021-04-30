package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.WzItemAddData;

public interface WzItemAddDataRepository extends JpaRepository<WzItemAddData, Integer>, JpaSpecificationExecutor<WzItemAddData> {

}