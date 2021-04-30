package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cashshop_limit_sell")
public class CashShopLimitSell {

    @Id
    @Column(name = "serial", nullable = false)
    private Integer serial;

    @Column(name = "amount", nullable = false)
    private Integer amount = 0;

}
