package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "konum")
@Data
public class Konum {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_konum", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_konum", sequenceName = "konum_seq", allocationSize = 1)
    private int id;

    @Column(name = "boylam")
    private String boylam;

    @Column(name = "enlem")
    private String enlem;

    @Column(name = "dogruluk")
    private String dogruluk;
}
