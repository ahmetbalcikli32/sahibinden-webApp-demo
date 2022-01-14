package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "kategori")
@Data
public class Kategori {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_kategori", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_kategori", sequenceName = "kategori_seq", allocationSize = 1)
    private int id;

    @Column(name = "adi", length = 50)
    private String adi;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kategori")
    private List<AltKategori> altKategoriList = new ArrayList<>();

}
