package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "keymap")
public class KeyMap {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "key", nullable = false)
    private Integer key = 0;

    @Column(name = "type", nullable = false)
    private Integer type = 0;

    @Column(name = "action", nullable = false)
    private Integer action = 0;

}
