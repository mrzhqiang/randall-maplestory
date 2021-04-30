package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "onetimelog")
public class OneTimeLog {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "log", nullable = false)
    private String log;

}
