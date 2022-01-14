package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kisi")
@Data
public class Kisi {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_kisi", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_kisi", sequenceName = "kisi_seq", allocationSize = 1)
    private int id;

    @Column(name = "adi", length = 50, nullable = false)
    private String adi;

    @Column(name = "soyadi", length = 50, nullable = false)
    private String soyadi;

    @Column(name = "username", length = 50, unique = true, nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "telefon_no", length = 12, unique = true, nullable = false)
    private String telefonNo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kisi")
    private List<Ilan> ilanList;

}
