package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.Guild;

public interface GuildRepository extends JpaRepository<Guild, Integer>, JpaSpecificationExecutor<Guild> {

}