package ahmet.balcikli.shoppingApp.enums.controller;

import ahmet.balcikli.shoppingApp.enums.models.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping(value = "/enums", produces = {MediaType.APPLICATION_JSON_VALUE})
public interface IEnumController {

    @GetMapping("/cekis-list")
    ResponseEntity<List<Cekis>> findCekisList();

    @GetMapping("/durumu-list")
    ResponseEntity<List<Durumu>> findDurumuList();

    @GetMapping("/evet-hayir-list")
    ResponseEntity<List<EvetHayir>> findEvetHayir();

    @GetMapping("/ilan-tarihi-list")
    ResponseEntity<List<IlanTarihi>> findIlanTarihiList();

    @GetMapping("/kapi-sayisi-list")
    ResponseEntity<List<KapiSayisi>> findKapiSayisiList();

    @GetMapping("/kasa-tipi-list")
    ResponseEntity<List<KasaTipi>> findKasaTipiList();

    @GetMapping("/bayili-kimden-list")
    ResponseEntity<List<KimdenBayili>> findBayiliKimdenList();

    @GetMapping("/bayisiz-kimden-list")
    ResponseEntity<List<KimdenBayisiz>> findBayisizKimdenList();

    @GetMapping("/motosiklet-kimden-list")
    ResponseEntity<List<KimdenMotosiklet>> findMotosikletKimdenList();

    @GetMapping("/koltuk-sayisi-list")
    ResponseEntity<List<KoltukSayisi>> findKoltukSayisiList();

    @GetMapping("/motor-hacmi-list")
    ResponseEntity<List<MotorHacmi>> findMotorHacmiList();

    @GetMapping("/plaka-uyruk-list")
    ResponseEntity<List<PlakaUyruk>> findPlakaUyrukList();

    @GetMapping("/renk-list")
    ResponseEntity<List<Renk>> findRenkList();

    @GetMapping("/ruhsat-kaydi-list")
    ResponseEntity<List<RuhsatKaydi>> findRuhsatKaydiList();

    @GetMapping("/sasi-tipi-list")
    ResponseEntity<List<SasiTipi>> findSasiTipiList();

    @GetMapping("/silindir-sayisi-list")
    ResponseEntity<List<SilindirSayisi>> findSilindirSayisiList();

    @GetMapping("/sogutma-list")
    ResponseEntity<List<Sogutma>> findSogutmaList();

    @GetMapping("/vites-turu-list")
    ResponseEntity<List<VitesTuru>> findVitesTuruList();

    @GetMapping("/zamanlama-tipi-list")
    ResponseEntity<List<ZamanlamaTipi>> findZamanlamaTipiList();

}
