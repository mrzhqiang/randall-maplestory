package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questreqdata")
public class WzQuestReqData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "questid", nullable = false)
    private Integer questid = 0;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "type", nullable = false)
    private Integer type = 0;

    @Column(name = "stringStore", nullable = false)
    private String stringStore = "";

    @Column(name = "intStoresFirst", nullable = false)
    private String intStoresFirst = "";

    @Column(name = "intStoresSecond", nullable = false)
    private String intStoresSecond = "";

}
