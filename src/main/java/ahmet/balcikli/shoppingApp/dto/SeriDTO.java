package ahmet.balcikli.shoppingApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class SeriDTO {

    private int id;
    private String seriAdi;
    private List<ModelDTO> modelList;
}
