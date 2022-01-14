package ahmet.balcikli.shoppingApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class IlDTO {

    private int id;
    private String ilAdi;
    private List<IlceDTO> ilceler;
}
