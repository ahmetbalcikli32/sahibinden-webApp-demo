package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Cekis {

    ONDEN_CEKIS("Önden Çekiş"),
    ARKADAN_ITIS("Arkadan İtiş"),
    FWD("4WD (Sürekli)"),
    AWD("AWD (Elektronik)");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
