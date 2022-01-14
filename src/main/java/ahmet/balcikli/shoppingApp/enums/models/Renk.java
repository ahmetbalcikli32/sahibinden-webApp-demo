package ahmet.balcikli.shoppingApp.enums.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Renk {

    BEJ("Bej"),
    BEYAZ("Beyaz"),
    BORDO("Bordo"),
    FUME("Füme"),
    GRI("Gri"),
    GUMUS_GRI("Gümüş Gri"),
    KAHVERENGI("Kahverengi"),
    KIRMIZI("Kırmızı"),
    LACIVERT("Lacivert"),
    MAVI("Mavi"),
    MOR("Mor"),
    PEMBE("Pembe"),
    SARI("Sarı"),
    SIYAH("Siyah"),
    SAMPANYA("Şampanya"),
    TURKUAZ("Turkuaz"),
    TURUNCU("Turuncu"),
    YESIL("Yesil");

    private String label;

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return name();
    }
}
