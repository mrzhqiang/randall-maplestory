package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mulungdojo")
public class MulungDojo {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "charid", nullable = false)
    private Integer charid = 0;

    @Column(name = "stage", nullable = false)
    private Integer stage = 0;

}
