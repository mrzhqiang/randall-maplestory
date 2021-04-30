package randall.maplestory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import randall.maplestory.domain.GamePollReply;

public interface GamePollReplyRepository extends JpaRepository<GamePollReply, Integer>, JpaSpecificationExecutor<GamePollReply> {

}