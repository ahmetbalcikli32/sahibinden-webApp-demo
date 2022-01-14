package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.*;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "base_specs")
@Data
public class BaseSpecs {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_base_specs", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_base_specs", sequenceName = "base_specs_seq", allocationSize = 1)
    private int id;

    @Column(name = "kilometre", nullable = false)
    private Integer kilometre;

    @Column(name = "yil", nullable = false, length = 4)
    private Integer yil;

    @Enumerated(EnumType.STRING)
    @Column(name = "yakit")
    private YakitTuru yakit;

    @Enumerated(EnumType.STRING)
    @Column(name = "vites")
    private VitesTuru vites;

    @Enumerated(EnumType.STRING)
    private KasaTipi kasaTipi;

    @Enumerated(EnumType.STRING)
    @Column(name = "cekis")
    private Cekis cekis;

    @Column(name = "motor_hacmi", nullable = false, length = 5)
    private Integer motorHacmi;

    @Column(name = "motor_gucu", nullable = false, length = 4)
    private Integer motorGucu;

    @Enumerated(EnumType.STRING)
    @Column(name = "renk", nullable = false)
    private Renk renk;
}
