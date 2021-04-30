package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "nxcode")
public class NxCode {

    @Id
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "valid", nullable = false)
    private Integer valid = 1;

    @Column(name = "user")
    private String user;

    @Column(name = "type", nullable = false)
    private Integer type = 0;

    @Column(name = "item", nullable = false)
    private Integer item = 10000;

    @Column(name = "size")
    private Integer size;

}
