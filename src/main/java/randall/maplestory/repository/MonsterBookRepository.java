package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.MonsterBook;

public interface MonsterBookRepository extends JpaRepository<MonsterBook, Integer>, JpaSpecificationExecutor<MonsterBook> {

}