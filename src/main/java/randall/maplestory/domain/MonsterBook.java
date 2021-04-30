package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "monsterbook")
public class MonsterBook {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "charid", nullable = false)
    private Integer charid = 0;

    @Column(name = "cardid", nullable = false)
    private Integer cardid = 0;

    @Column(name = "level")
    private Integer level = 1;

}
