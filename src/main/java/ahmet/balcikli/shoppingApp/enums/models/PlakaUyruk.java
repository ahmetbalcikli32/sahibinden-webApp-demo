package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PlakaUyruk {

    TURKIYE_PLAKALI("Türkiye (TR) Plakalı"),
    YABANCI_PLAKALI("Yabancı Plakalı"),
    MAVI_PLAKALI("Mavi (MA) Plakalı");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
