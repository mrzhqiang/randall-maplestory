package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questpartydata")
public class WzQuestPartyData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "questid", nullable = false)
    private Integer questid = 0;

    @Column(name = "rank", nullable = false)
    private String rank = "";

    @Column(name = "mode", nullable = false)
    private String mode = "";

    @Column(name = "property", nullable = false)
    private String property = "";

    @Column(name = "value", nullable = false)
    private Integer value = 0;

}
