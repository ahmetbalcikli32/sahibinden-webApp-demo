package ahmet.balcikli.shoppingApp.dto;

import ahmet.balcikli.shoppingApp.model.Il;
import ahmet.balcikli.shoppingApp.model.Ilce;
import ahmet.balcikli.shoppingApp.model.Mahalle;
import lombok.Data;

@Data
public class AdresDTO {

    private int id;
    private Il il;
    private Ilce ilce;
    private Mahalle mahalle;

}
