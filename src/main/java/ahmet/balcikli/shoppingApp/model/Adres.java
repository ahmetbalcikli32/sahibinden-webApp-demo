package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "adres")
@Data
public class Adres {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_adres", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_adres", sequenceName = "adres_seq", allocationSize = 1)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "il_id", foreignKey = @ForeignKey(name = "fk_adres_il"))
    private Il il;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ilce_id", foreignKey = @ForeignKey(name = "fk_adres_ilce"))
    private Ilce ilce;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mahalle_id", foreignKey = @ForeignKey(name = "fk_adres_mahalle"))
    private Mahalle mahalle;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "kisi_id", foreignKey = @ForeignKey(name = "fk_adres_kisi"))
    private Kisi kisi;

}
