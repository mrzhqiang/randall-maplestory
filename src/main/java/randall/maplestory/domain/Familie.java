package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "families")
public class Familie {

    @Id
    @Column(name = "familyid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer familyid;

    @OneToOne
    @JoinColumn(name = "leaderid", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Character leader;

    @OneToMany(mappedBy = "family")
    private List<Character> members;

    @Column(name = "notice", nullable = false)
    private String notice = "";

}
