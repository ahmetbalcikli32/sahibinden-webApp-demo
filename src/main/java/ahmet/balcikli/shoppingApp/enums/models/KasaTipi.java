package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum KasaTipi {

    CABRIO("Cabrio"),
    COUPE("Coupe"),
    HATCHBACK_3KAPI("Hatchback 3-kapı"),
    HATCHBACK_5KAPI("Hatchback 5-kapı"),
    SEDAN("Sedan"),
    STATION_WAGON("Station Wagon"),
    MPV("MPV"),
    ROADSTER("Roadster");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
