package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questrequirements")
public class QuestRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questrequirementid", nullable = false)
    private Integer questrequirementid;

    @Column(name = "questid", nullable = false)
    private Integer questid = 0;

    @Column(name = "status", nullable = false)
    private Integer status = 0;

    @Column(name = "data", nullable = false)
    private byte[] data;

}
