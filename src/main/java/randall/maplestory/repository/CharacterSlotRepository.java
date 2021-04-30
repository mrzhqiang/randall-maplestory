package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.CharacterSlot;

public interface CharacterSlotRepository extends JpaRepository<CharacterSlot, Integer>, JpaSpecificationExecutor<CharacterSlot> {

}