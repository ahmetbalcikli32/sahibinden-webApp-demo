package ahmet.balcikli.shoppingApp.model;

import ahmet.balcikli.shoppingApp.enums.models.EvetHayir;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ozellikler")
@Data
public class Ozellikler {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "pk_base_specs", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pk_base_specs", sequenceName = "base_specs_seq", allocationSize = 1)
    private int id;
    @Column(name = "abs")
    private EvetHayir abs;
    @Column(name = "asr")
    private EvetHayir asr;
    @Column(name = "eba")
    private EvetHayir eba;
    @Column(name = "gece_gorus")
    private EvetHayir geceGorus;
    @Column(name = "hava_yastigi_tavan")
    private EvetHayir havaYastigiTavan;
    @Column(name = "isofix")
    private EvetHayir isofix;
    @Column(name = "serit_degistirme_yardimcisi")
    private EvetHayir seritDegistirmeYrd;
    @Column(name = "zirhli_arac")
    private EvetHayir zirhliArac;
    @Column(name = "aeb")
    private EvetHayir aeb;
    @Column(name = "bas")
    private EvetHayir bas;
    @Column(name = "ebd")
    private EvetHayir ebd;
    @Column(name = "hava_yastigi_diz")
    private EvetHayir havaYastigiDiz;
    @Column(name = "hava_yastigi_yan")
    private EvetHayir havaYastigiYan;
    @Column(name = "kor_nokta_uyari_sistemi")
    private EvetHayir korNoktaUyariSis;
    @Column(name = "seritten_ayrilma_ikazi")
    private EvetHayir serittenAyrilmaIkazi;
    @Column(name = "airmatic")
    private EvetHayir airmatic;
    @Column(name = "cocuk_kilidi")
    private EvetHayir cocukKilidi;
    @Column(name = "edl")
    private EvetHayir edl;
    @Column(name = "hava_yastigi_perde")
    private EvetHayir havaYastigiPerde;
    @Column(name = "hava_yastigi_yolcu")
    private EvetHayir havaYastigiYolcu;
    @Column(name = "lastik_ariza_gostergesi")
    private EvetHayir lastikArizaGostergesi;
    @Column(name = "tcs")
    private EvetHayir tcs;
    @Column(name = "alarm")
    private EvetHayir alarm;
    @Column(name = "distronic")
    private EvetHayir distronic;
    @Column(name = "esp_vsa")
    private EvetHayir esp;
    @Column(name = "hava_yastigi_surucu")
    private EvetHayir havaYastigiSurucu;
    @Column(name = "immobiliser")
    private EvetHayir immobiliser;
    @Column(name = "merkezi_kilit")
    private EvetHayir merkeziKilit;
    @Column(name = "yokus_kalkis_destegi")
    private EvetHayir yokusKalkisDestegi;
}
