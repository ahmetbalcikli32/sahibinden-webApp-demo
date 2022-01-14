package ahmet.balcikli.shoppingApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class ModelDTO {

    private int id;
    private String modelAdi;
    private List<PaketDTO> paketList;

}
