package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "storages")
public class Storage {

    @Id
    @Column(name = "storageid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer storageid;

    @Column(name = "accountid", nullable = false)
    private Integer accountid = 0;

    @Column(name = "slots", nullable = false)
    private Integer slots = 0;

    @Column(name = "meso", nullable = false)
    private Integer meso = 0;

}
