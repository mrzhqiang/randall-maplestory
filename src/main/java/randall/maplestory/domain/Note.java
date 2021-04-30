package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "notes")
public class Note {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "to", nullable = false)
    private String to = "";

    @Column(name = "from", nullable = false)
    private String from = "";

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "timestamp", nullable = false)
    private Long timestamp;

    @Column(name = "gift", nullable = false)
    private Integer gift = 0;

}
