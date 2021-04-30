package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "wz_oxdata")
@IdClass(WzOxData.WzOxDataId.class)
public class WzOxData implements Serializable {

    @Id
    @Column(name = "questionset", nullable = false)
    private Integer questionset = 0;

    @Id
    @Column(name = "questionid", nullable = false)
    private Integer questionid = 0;

    @Column(name = "question", nullable = false)
    private String question = "";

    @Column(name = "display", nullable = false)
    private String display = "";

    @Column(name = "answer", nullable = false)
    private String answer;

    public static class WzOxDataId implements Serializable {
        public int questionset;
        public int questionid;
    }
}
