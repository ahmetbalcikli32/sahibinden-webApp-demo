package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "ilan")
@Data
public class Ilan {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "pk_ilan", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_ilan", sequenceName = "ilan_seq", allocationSize = 1)
    private long id;

    @Column(name = "baslik", length = 100)
    private String baslik;

    @Column(name = "ilan_no", length = 15)
    private long ilanNo;

    @Column(name = "ilan_tarihi")
    private Date ilanTarihi;

    @OneToOne
    @JoinColumn(name = "adres_id", foreignKey = @ForeignKey(name = "fk_ilan_adres"))
    private Adres adres;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "kisi_id", foreignKey = @ForeignKey(name = "fk_ilan_kisi"))
    private Kisi kisi;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ilan")
    private List<Fotograf> fotografList;

    @OneToOne
    @JoinColumn(name = "konum_id", foreignKey = @ForeignKey(name = "fk_ilan_konum"))
    private Konum konum;

    @Column(name = "fiyat", scale = 2, precision = 10)
    private BigDecimal fiyat;
}
