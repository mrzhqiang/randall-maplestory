package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wz_itemadddata")
public class WzItemAddData {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "itemid", nullable = false)
    private Integer itemid;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "subKey", nullable = false)
    private String subKey;

    @Column(name = "value", nullable = false)
    private String value;

}
