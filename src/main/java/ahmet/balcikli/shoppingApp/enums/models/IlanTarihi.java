package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum IlanTarihi {

    SON_24_SAAT("Son 24 saat"),
    SON_3_GUN_ICINDE("Son 3 gün içinde"),
    SON_7_GUN_ICINDE("Son 7 gün içinde"),
    SON_15_GUN_ICINDE("Son 15 gün içinde"),
    SON_30_GUN_ICINDE("Son 30 gün içinde");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
