package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wz_questdata")
public class WzQuestData {

    @Id
    @Column(name = "questid", nullable = false)
    private Integer questid;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "autoStart", nullable = false)
    private Integer autoStart = 0;

    @Column(name = "autoPreComplete", nullable = false)
    private Integer autoPreComplete = 0;

    @Column(name = "viewMedalItem", nullable = false)
    private Integer viewMedalItem = 0;

    @Column(name = "selectedSkillID", nullable = false)
    private Integer selectedSkillID = 0;

    @Column(name = "blocked", nullable = false)
    private Integer blocked = 0;

    @Column(name = "autoAccept", nullable = false)
    private Integer autoAccept = 0;

    @Column(name = "autoComplete", nullable = false)
    private Integer autoComplete = 0;

}
