package ahmet.balcikli.shoppingApp.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Data
public class IlanDTO {

    private long id;
    private String baslik;
    private long ilanNo;
    private Date ilanTarihi;
    private AdresDTO adres;
    private KisiDTO kisi;
    private List<String> fotografUrlList;
    private KonumDTO konum;
    private BigDecimal fiyat;
}
