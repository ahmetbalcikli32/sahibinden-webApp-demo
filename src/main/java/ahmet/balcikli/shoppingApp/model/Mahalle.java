package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mahalle")
@Data
public class Mahalle {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_mahalle", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_mahalle", sequenceName = "mahalle_seq", allocationSize = 1)
    private int id;

    @Column(name = "mahalle_adi", nullable = false, length = 100)
    private String mahalleAdi;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ilce_id", foreignKey = @ForeignKey(name = "fk_mahalle_ilce"))
    private Ilce ilce;
}
