package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EvetHayir {

    EVET("Evet"),
    HAYIR("Hayır");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
