package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @Column(name = "petid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer petid;

    @Column(name = "name")
    private String name;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "closeness", nullable = false)
    private Integer closeness;

    @Column(name = "fullness", nullable = false)
    private Integer fullness;

    @Column(name = "seconds", nullable = false)
    private Integer seconds = 0;

    @Column(name = "flags", nullable = false)
    private Integer flags = 0;

}
