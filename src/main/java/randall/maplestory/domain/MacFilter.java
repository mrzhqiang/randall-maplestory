package randall.maplestory.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "macfilters")
public class MacFilter {

    @Id
    @Column(name = "macfilterid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer macfilterid;

    @Column(name = "filter", nullable = false)
    private String filter;

}
