package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dueypackages")
public class DueyPackage {

    @Id
    @Column(name = "PackageId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer packageId;

    @Column(name = "RecieverId", nullable = false)
    private Integer recieverId;

    @Column(name = "SenderName", nullable = false)
    private String senderName;

    @Column(name = "Mesos")
    private Integer mesos = 0;

    @Column(name = "TimeStamp")
    private Long timeStamp;

    @Column(name = "Checked")
    private Integer checked = 1;

    @Column(name = "Type", nullable = false)
    private Integer type;

}
