package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum KimdenMotosiklet {

    SAHIBINDEN("Sahibinden"),
    MOTOSIKLET_MAGAZASINDAN("Motosiklet Mağazasından");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
