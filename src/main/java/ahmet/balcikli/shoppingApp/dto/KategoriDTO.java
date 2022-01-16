package ahmet.balcikli.shoppingApp.dto;

import ahmet.balcikli.shoppingApp.model.AltKategori;
import lombok.Data;

import java.util.List;

@Data
public class KategoriDTO {

    private int id;
    private String adi;
    private List<AltKategoriDTO> altKategoriList;
}
