package ahmet.balcikli.shoppingApp.enums.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum YakitTuru {

    BENZIN("Benzin"),
    BENZIN_LPG("Benzin & LPG"),
    DIZEL("Dizel"),
    HYBRID("Hybrid"),
    ELEKTRIK("Elektrik");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
