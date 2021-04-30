package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "mts_items")
public class Mtsitem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tab", nullable = false)
    private Integer tab = 1;

    @Column(name = "price", nullable = false)
    private Integer price = 0;

    @Column(name = "characterid", nullable = false)
    private Integer characterid = 0;

    @Column(name = "seller", nullable = false)
    private String seller = "";

    @Column(name = "expiration", nullable = false)
    private Long expiration = 0L;

}
