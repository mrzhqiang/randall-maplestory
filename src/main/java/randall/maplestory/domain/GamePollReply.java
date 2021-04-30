package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "game_poll_reply")
public class GamePollReply {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "AccountId", nullable = false)
    private Integer accountId;

    @Column(name = "SelectAns", nullable = false)
    private Integer selectAns = 0;

}
