package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fotograf")
@Data

public class Fotograf {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_fotograf", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_fotograf", sequenceName = "fotograf_seq", allocationSize = 1)
    private long id;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ilan_id", foreignKey = @ForeignKey(name = "fk_fotograf_ilan"))
    private Ilan ilan;
}
