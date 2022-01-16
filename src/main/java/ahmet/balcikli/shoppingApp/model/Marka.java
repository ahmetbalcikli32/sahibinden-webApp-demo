package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marka")
@Data
public class Marka {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_marka", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_marka", sequenceName = "marka_seq", allocationSize = 1)
    private int id;

    @Column(name = "marka_adi", length = 30)
    private String markaAdi;

    @OneToOne
    @JoinColumn(name = "altkategori_id", foreignKey = @ForeignKey(name = "fk_marka_altkategori"))
    private AltKategori altKategori;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "marka")
    private List<Seri> seriList;

}
