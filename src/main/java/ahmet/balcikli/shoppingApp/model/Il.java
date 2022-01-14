package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "iller", schema = "public")
@Data

public class Il implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_il", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_il", sequenceName = "il_seq", allocationSize = 1)
    private int id;

    @Column(name = "il_adi", length = 30, unique = true)
    private String ilAdi;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "il")
    private List<Ilce> ilceler;

}
