package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.KapiSayisi;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "arazi_suv_pickup")
@Data
public class AraziSuvPickup {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_motosiklet", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_motosiklet", sequenceName = "motosiklet_seq", allocationSize = 1)
    private long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ilan_id")
    private Ilan ilan;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_otomobil_category"))
    private Kategori kategori;

    @OneToOne
    @JoinColumn(name = "marka_id", foreignKey = @ForeignKey(name = "fk_otomobil_marka"))
    private Marka marka;

    @OneToOne
    @JoinColumn(name = "seri_id", foreignKey = @ForeignKey(name = "fk_otomobil_seri"))
    private Seri seri;

    @OneToOne
    @JoinColumn(name = "model_id", foreignKey = @ForeignKey(name = "fk_otomobil_model"))
    private Model model;

    @OneToOne
    @JoinColumn(name = "paket_id", foreignKey = @ForeignKey(name = "fk_otomobil_paket"))
    private Paket paket;

    @OneToOne
    @JoinColumn(name = "base_spec_id", foreignKey = @ForeignKey(name = "fk_otomobil_base_spec"))
    private BaseSpecs baseSpecs;

    @OneToOne
    @JoinColumn(name = "detail_spec_id", foreignKey = @ForeignKey(name = "fk_otomobil_detail_spec"))
    private DetailSpecs detailSpecs;

    @Enumerated(EnumType.STRING)
    @Column(name = "kapi_sayisi", nullable = false, length = 10)
    private KapiSayisi kapiSayisi;
}
