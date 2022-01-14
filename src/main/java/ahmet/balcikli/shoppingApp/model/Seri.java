package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seri")
@Data
public class Seri {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_seri", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_seri", sequenceName = "seri_seq", allocationSize = 1)
    private int id;

    @Column(name = "seri_adi", length = 30)
    private String seriAdi;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "marka_id", foreignKey = @ForeignKey(name = "fk_seri_marka"))
    private Marka marka;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "seri")
    private List<Model> modelList;
}
