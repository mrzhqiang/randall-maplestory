package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "character_slots")
public class CharacterSlot {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accid", nullable = false)
    private Integer accid = 0;

    @Column(name = "worldid", nullable = false)
    private Integer worldid = 0;

    @Column(name = "charslots", nullable = false)
    private Integer charslots = 6;

}
