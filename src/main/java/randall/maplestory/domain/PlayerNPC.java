package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "playernpcs")
public class PlayerNPC {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "hair", nullable = false)
    private Integer hair;

    @Column(name = "face", nullable = false)
    private Integer face;

    @Column(name = "skin", nullable = false)
    private Integer skin;

    @Column(name = "x", nullable = false)
    private Integer x = 0;

    @Column(name = "y", nullable = false)
    private Integer y = 0;

    @Column(name = "map", nullable = false)
    private Integer map;

    @Column(name = "charid", nullable = false)
    private Integer charid;

    @Column(name = "scriptid", nullable = false)
    private Integer scriptid;

    @Column(name = "foothold", nullable = false)
    private Integer foothold;

    @Column(name = "dir", nullable = false)
    private Integer dir = 0;

    @Column(name = "gender", nullable = false)
    private Integer gender = 0;

    @Column(name = "pets")
    private String pets = "0,0,0";

}
