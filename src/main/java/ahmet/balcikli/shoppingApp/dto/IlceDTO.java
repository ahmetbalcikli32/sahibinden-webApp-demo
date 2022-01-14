package ahmet.balcikli.shoppingApp.dto;

import ahmet.balcikli.shoppingApp.model.Mahalle;
import lombok.Data;

import java.util.List;

@Data
public class IlceDTO {

    private int id;
    private String ilceAdi;
    private List<Mahalle> mahalleler;
}
