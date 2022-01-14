package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum KoltukSayisi {

    BIR_ARTI_BIR("1+1"),
    IKI_ARTI_BIR("2+1"),
    UC_ARTI_BIR("3+1"),
    DORT_ARTI_BIR("4+1"),
    BES_ARTI_BIR("5+1"),
    ALTI_ARTI_BIR("6+1"),
    YEDI_ARTI_BIR("7+1"),
    SEKIZ_ARTI_BIR("8+1"),
    DOKUZ_ARTI_BIR("9+1"),
    ON_ARTI_BIR("10+1"),
    ON_BIR_ARTI_BIR("11+1"),
    ON_IKI_ARTI_BIR("12+1"),
    ON_UC_ARTI_BIR("13+1"),
    ON_DORT_ARTI_BIR("14+1"),
    ON_BES_ARTI_BIR("15+1");

    private final String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
