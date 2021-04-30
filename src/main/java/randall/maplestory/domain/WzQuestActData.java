package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_questactdata")
public class WzQuestActData {

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

    @Column(name = "intStore", nullable = false)
    private Integer intStore = 0;

    @Column(name = "applicableJobs", nullable = false)
    private String applicableJobs = "";

    @Column(name = "uniqueid", nullable = false)
    private Integer uniqueid = 0;

}
