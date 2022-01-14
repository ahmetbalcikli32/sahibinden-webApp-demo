package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "model")
@Data
public class Model {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_model", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_model", sequenceName = "model_seq", allocationSize = 1)
    private int id;

    @Column(name = "model_adi", length = 30)
    private String modelAdi;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "seri_id", foreignKey = @ForeignKey(name = "fk_model_seri"))
    private Seri seri;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
    private List<Paket> paketList;

}
