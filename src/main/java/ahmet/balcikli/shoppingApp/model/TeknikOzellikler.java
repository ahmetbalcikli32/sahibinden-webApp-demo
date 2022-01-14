package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teknik_specs")
@Data
public class TeknikOzellikler {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_teknik_specs", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_teknik_specs", sequenceName = "teknik_specs_seq", allocationSize = 1)
    private long id;
}
