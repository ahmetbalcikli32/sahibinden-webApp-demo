package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MotorHacmi {

    V1300_CM3E_KADAR("1300 cm3'e kadar"),
    V1301_1600_CM3("1301 - 1600 cm3"),
    V1601_1800_CM3("1601 - 1800 cm3"),
    V1801_2000_CM3("1801 - 2000 cm3"),
    V2001_2500_CM3("2001 - 2500 cm3"),
    V2501_3000_CM3("2501 - 3000 cm3"),
    V3001_3500_CM3("3001 - 3500 cm3"),
    V3501_4000_CM3("3501 - 4000 cm3"),
    V4001_4500_CM3("4001 - 4500 cm3"),
    V4501_5000_CM3("4501 - 5000 cm3"),
    V5001_5500_CM3("5001 - 5500 cm3"),
    V5501_6000_CM3("5501 - 6000 cm3"),
    V6001_CM3_UZERI("6001 cm3 ve üzeri");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
