package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import randall.maplestory.domain.Character;

import java.util.Optional;

public interface CharacterRepository extends JpaRepository<Character, Integer>, JpaSpecificationExecutor<Character> {

    @Query("SELECT MAX(party)+2 FROM characters")
    Optional<Character> findMaxParty();

}