package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wishlist")
public class WishList {

    @Id
    @Column(name = "characterid", nullable = false)
    private Integer characterid;

    @Column(name = "sn", nullable = false)
    private Integer sn;

}
