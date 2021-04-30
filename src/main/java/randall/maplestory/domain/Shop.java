package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shops")
public class Shop {

    @Id
    @Column(name = "shopid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopid;

    @Column(name = "npcid", nullable = false)
    private Integer npcid = 0;

}
