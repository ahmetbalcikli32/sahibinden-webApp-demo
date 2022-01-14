package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.EvetHayir;
import ahmet.balcikli.shoppingApp.enums.models.PlakaUyruk;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "detail_specs")
@Data
public class DetailSpecs {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_detail_specs", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_detail_specs", sequenceName = "detail_specs_seq", allocationSize = 1)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "garanti", nullable = false, length = 1)
    private EvetHayir garanti;

    @Enumerated(EnumType.STRING)
    @Column(name = "plaka_turu", length = 30)
    private PlakaUyruk plakaUyruk;

    @Enumerated(EnumType.STRING)
    @Column(name = "takas", nullable = false, length = 1)
    private EvetHayir takas;

    @Enumerated(EnumType.STRING)
    @Column(name = "durumu", nullable = false, length = 1)
    private EvetHayir durumu;

    @Enumerated(EnumType.STRING)
    @Column(name = "goruntulu_arama", nullable = false, length = 1)
    private EvetHayir goruntuluArama;

    @Column(name = "aciklama")
    private String aciklama;

    @OneToOne
    @JoinColumn(name = "ozellik_id", foreignKey = @ForeignKey(name = "fk_detail_specs_ozellik"))
    private Ozellikler ozellikler;

//    private TeknikOzellikler teknikOzellikler;

}
