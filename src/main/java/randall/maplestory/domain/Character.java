package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accountid", nullable = false)
    private Integer accountId = 0;

    @Column(name = "world", nullable = false)
    private Integer world = 0;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "level", nullable = false)
    private Integer level = 0;

    @Column(name = "exp", nullable = false)
    private Integer exp = 0;

    @Column(name = "str", nullable = false)
    private Integer str = 0;

    @Column(name = "dex", nullable = false)
    private Integer dex = 0;

    @Column(name = "luk", nullable = false)
    private Integer luk = 0;

    @Column(name = "int", nullable = false)
    private Integer intelligence = 0;

    @Column(name = "hp", nullable = false)
    private Integer hp = 0;

    @Column(name = "mp", nullable = false)
    private Integer mp = 0;

    @Column(name = "maxhp", nullable = false)
    private Integer maxhp = 0;

    @Column(name = "maxmp", nullable = false)
    private Integer maxmp = 0;

    @Column(name = "meso", nullable = false)
    private Integer meso = 0;

    @Column(name = "hpApUsed", nullable = false)
    private Integer hpApUsed = 0;

    @Column(name = "job", nullable = false)
    private Integer job = 0;

    @Column(name = "skincolor", nullable = false)
    private Integer skincolor = 0;

    @Column(name = "gender", nullable = false)
    private Integer gender = 0;

    @Column(name = "fame", nullable = false)
    private Integer fame = 0;

    @Column(name = "hair", nullable = false)
    private Integer hair = 0;

    @Column(name = "face", nullable = false)
    private Integer face = 0;

    @Column(name = "ap", nullable = false)
    private Integer ap = 0;

    @Column(name = "map", nullable = false)
    private Integer map = 0;

    @Column(name = "spawnpoint", nullable = false)
    private Integer spawnpoint = 0;

    @Column(name = "gm", nullable = false)
    private Integer gm = 0;

    @Column(name = "party", nullable = false)
    private Integer party = 0;

    @Column(name = "buddyCapacity", nullable = false)
    private Integer buddyCapacity = 25;

    @Column(name = "createdate", nullable = false)
    private Date createdate = new Date();

    @ManyToOne
    @JoinColumn(name = "guildid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Guild guild;

    @Column(name = "guildrank", nullable = false)
    private Integer guildrank = 5;

    @Column(name = "allianceRank", nullable = false)
    private Integer allianceRank = 5;

    @Column(name = "monsterbookcover", nullable = false)
    private Integer monsterbookcover = 0;

    @Column(name = "dojo_pts", nullable = false)
    private Integer dojoPts = 0;

    @Column(name = "dojoRecord", nullable = false)
    private Integer dojoRecord = 0;

    @Column(name = "pets", nullable = false)
    private String pets = "-1,-1,-1";

    @Column(name = "sp", nullable = false)
    private String sp = "0,0,0,0,0,0,0,0,0,0";

    @Column(name = "subcategory", nullable = false)
    private Integer subcategory = 0;

    @Column(name = "Jaguar", nullable = false)
    private Integer jaguar = 0;

    @Column(name = "rank", nullable = false)
    private Integer rank = 1;

    @Column(name = "rankMove", nullable = false)
    private Integer rankMove = 0;

    @Column(name = "jobRank", nullable = false)
    private Integer jobRank = 1;

    @Column(name = "jobRankMove", nullable = false)
    private Integer jobRankMove = 0;

    @Column(name = "marriageId", nullable = false)
    private Integer marriageId = 0;

    @ManyToOne
    @JoinColumn(name = "familyid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Familie family;

    @Column(name = "seniorid", nullable = false)
    private Integer seniorid = 0;

    @Column(name = "junior1", nullable = false)
    private Integer junior1 = 0;

    @Column(name = "junior2", nullable = false)
    private Integer junior2 = 0;

    @Column(name = "currentrep", nullable = false)
    private Integer currentrep = 0;

    @Column(name = "totalrep", nullable = false)
    private Integer totalrep = 0;

    @Column(name = "charmessage", nullable = false)
    private String charmessage = "安安";

    @Column(name = "expression", nullable = false)
    private Integer expression = 0;

    @Column(name = "constellation", nullable = false)
    private Integer constellation = 0;

    @Column(name = "blood", nullable = false)
    private Integer blood = 0;

    @Column(name = "month", nullable = false)
    private Integer month = 0;

    @Column(name = "day", nullable = false)
    private Integer day = 0;

    @Column(name = "beans", nullable = false)
    private Integer beans = 0;

    @Column(name = "prefix")
    private Integer prefix = 0;

    @Column(name = "skillzq", nullable = false)
    private Integer skillzq = 0;

    @Column(name = "grname", nullable = false)
    private Integer grname = 0;

    @Column(name = "jzname", nullable = false)
    private Integer jzname = 0;

    @Column(name = "mrfbrw", nullable = false)
    private Integer mrfbrw = 0;

    @Column(name = "mrsjrw", nullable = false)
    private Integer mrsjrw = 0;

    @Column(name = "mrsgrw", nullable = false)
    private Integer mrsgrw = 0;

    @Column(name = "mrsbossrw", nullable = false)
    private Integer mrsbossrw = 0;

    @Column(name = "hythd", nullable = false)
    private Integer hythd = 0;

    @Column(name = "mrsgrwa", nullable = false)
    private Integer mrsgrwa = 0;

    @Column(name = "mrfbrwa", nullable = false)
    private Integer mrfbrwa = 0;

    @Column(name = "mrsbossrwa", nullable = false)
    private Integer mrsbossrwa = 0;

    @Column(name = "mrsgrws", nullable = false)
    private Integer mrsgrws = 0;

    @Column(name = "mrsbossrws", nullable = false)
    private Integer mrsbossrws = 0;

    @Column(name = "mrfbrws", nullable = false)
    private Integer mrfbrws = 0;

    @Column(name = "mrsgrwas", nullable = false)
    private Integer mrsgrwas = 0;

    @Column(name = "mrsbossrwas", nullable = false)
    private Integer mrsbossrwas = 0;

    @Column(name = "mrfbrwas", nullable = false)
    private Integer mrfbrwas = 0;

    @Column(name = "ddj")
    private Integer ddj = 0;

    @Column(name = "vip")
    private Integer vip = 0;

    @Column(name = "bosslog")
    private Integer bosslog = 0;

    @Column(name = "djjl", nullable = false)
    private Integer djjl = 0;

    @Column(name = "qiandao", nullable = false)
    private Integer qiandao = 0;

    @Column(name = "mountid", nullable = false)
    private Integer mountid = 0;

    @Column(name = "sg", nullable = false)
    private Integer sg = 0;

}
