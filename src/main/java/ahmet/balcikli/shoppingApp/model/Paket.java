package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "paket")
@Data
public class Paket {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_paket", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_paket", sequenceName = "paket_seq", allocationSize = 1)
    private int id;

    @Column(name = "paket_adi", length = 30)
    private String paketAdi;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "model_id", foreignKey = @ForeignKey(name = "fk_paket_model"))
    private Model model;
}
