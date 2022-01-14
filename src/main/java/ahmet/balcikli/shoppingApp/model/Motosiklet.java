package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.SilindirSayisi;
import ahmet.balcikli.shoppingApp.enums.models.Sogutma;
import ahmet.balcikli.shoppingApp.enums.models.ZamanlamaTipi;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "motosiklet")
@Data
public class Motosiklet {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_motosiklet", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_motosiklet", sequenceName = "motosiklet_seq", allocationSize = 1)
    private long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ilan_id")
    private Ilan ilan;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_motosiklet_category"))
    private Kategori kategori;

    @OneToOne
    @JoinColumn(name = "marka_id", foreignKey = @ForeignKey(name = "fk_motosiklet_marka"))
    private Marka marka;

    @OneToOne
    @JoinColumn(name = "seri_id", foreignKey = @ForeignKey(name = "fk_motosiklet_seri"))
    private Seri seri;

    @OneToOne
    @JoinColumn(name = "model_id", foreignKey = @ForeignKey(name = "fk_motosiklet_model"))
    private Model model;

    @OneToOne
    @JoinColumn(name = "base_spec_id", foreignKey = @ForeignKey(name = "fk_motosiklet_base_spec"))
    private BaseSpecs baseSpecs;

    @OneToOne
    @JoinColumn(name = "detail_spec_id", foreignKey = @ForeignKey(name = "fk_motosiklet_detail_spec"))
    private DetailSpecs detailSpecs;

    @Enumerated(EnumType.STRING)
    @Column(name = "zamanlama_tipi", nullable = false, length = 20)
    private ZamanlamaTipi zamanlamaTipi;

    @Enumerated(EnumType.STRING)
    @Column(name = "sogutma", nullable = false, length = 10)
    private Sogutma sogutma;

    @Enumerated(EnumType.STRING)
    @Column(name = "silindir_sayisi", nullable = false, length = 30)
    private SilindirSayisi silindirSayisi;
}
