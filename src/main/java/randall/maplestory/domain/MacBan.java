package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "macbans")
public class MacBan {

    @Id
    @Column(name = "macbanid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer macbanid;

    @Column(name = "mac", nullable = false)
    private String mac;

}
