package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ilce")
@Data
public class Ilce {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_ilce", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_ilce", sequenceName = "ilce_seq", allocationSize = 1)
    private int id;

    @Column(name = "ilce_adi", length = 30)
    private String ilceAdi;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "il_id", foreignKey = @ForeignKey(name = "fk_ilce_il"))
    private Il il;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ilce")
    private List<Mahalle> mahalleler;
}
