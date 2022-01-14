package ahmet.balcikli.shoppingApp.model;

import lombok.Data;

import javax.persistence.Column;
import java.sql.Timestamp;

@Data
public class BaseEntity {

    @Column(name = "eklyn")
    private String ekleyen;

    @Column(name = "EKLZMN")
    private Timestamp eklzmn;

    @Column(name = "GNCZMN")
    private Timestamp gnczmn;

    @Column(name = "STATU")
    private String statu;
}
