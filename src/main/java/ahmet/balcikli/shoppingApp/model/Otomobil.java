package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.KimdenBayili;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "otomobil")
@Data
public class Otomobil {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_otomobil", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_otomobil", sequenceName = "otomobil_seq", allocationSize = 1)
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

    @Enumerated(EnumType.STRING)
    @Column(name = "kimden")
    private KimdenBayili kimden;

    @OneToOne
    @JoinColumn(name = "base_spec_id", foreignKey = @ForeignKey(name = "fk_otomobil_base_spec"))
    private BaseSpecs baseSpecs;

    @OneToOne
    @JoinColumn(name = "detail_spec_id", foreignKey = @ForeignKey(name = "fk_otomobil_detail_spec"))
    private DetailSpecs detailSpecs;
}
