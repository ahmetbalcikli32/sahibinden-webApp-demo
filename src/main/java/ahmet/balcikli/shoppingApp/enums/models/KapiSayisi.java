package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum KapiSayisi {

    IKI("2"),
    UC("3"),
    DORT("4"),
    BES("5");

    private final String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
