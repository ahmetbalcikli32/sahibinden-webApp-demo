package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SilindirSayisi {

    TEK_SILINDIR("Tek Silindir"),
    CIFT_SILINDIR("Çift Silindir"),
    UC_SILINDIR("3 Silindir"),
    DORT_SILINDIR("4 Silindir"),
    ALTI_SILINDIR_VE_UZERI("6 Silindir ve üzeri");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
