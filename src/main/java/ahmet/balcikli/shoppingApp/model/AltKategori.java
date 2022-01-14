package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "alt_kategori")
@Data
public class AltKategori {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_alt_kategori", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_alt_kategori", sequenceName = "alt_kategori_seq", allocationSize = 1)
    private int id;

    @Column(name = "adi", length = 50)
    private String adi;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kategori_id", foreignKey = @ForeignKey(name = "fk_alt_kategori_kategori"))
    private Kategori kategori;
}
