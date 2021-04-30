package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hypay")
public class HyPay {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "accname")
    private String accname;

    @Column(name = "payUsed", nullable = false)
    private Integer payUsed;

    @Column(name = "pay", nullable = false)
    private Integer pay;

    @Column(name = "payReward", nullable = false)
    private Integer payReward;

}
