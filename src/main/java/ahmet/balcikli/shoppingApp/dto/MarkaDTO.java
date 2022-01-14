package ahmet.balcikli.shoppingApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class MarkaDTO {

    private int id;
    private String markaAdi;
    private List<SeriDTO> seriList;

}
