package ahmet.balcikli.shoppingApp.enums.controller.impl;

import ahmet.balcikli.shoppingApp.enums.controller.IEnumController;
import ahmet.balcikli.shoppingApp.enums.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class IEnumControllerImpl implements IEnumController {

    @Override
    public ResponseEntity<List<Cekis>> findCekisList() {
        return new ResponseEntity<>(Arrays.asList(Cekis.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Durumu>> findDurumuList() {
        return new ResponseEntity<>(Arrays.asList(Durumu.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<EvetHayir>> findEvetHayir() {
        return new ResponseEntity<>(Arrays.asList(EvetHayir.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<IlanTarihi>> findIlanTarihiList() {
        return new ResponseEntity<>(Arrays.asList(IlanTarihi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KapiSayisi>> findKapiSayisiList() {
        return new ResponseEntity<>(Arrays.asList(KapiSayisi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KasaTipi>> findKasaTipiList() {
        return new ResponseEntity<>(Arrays.asList(KasaTipi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KimdenBayili>> findBayiliKimdenList() {
        return new ResponseEntity<>(Arrays.asList(KimdenBayili.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KimdenBayisiz>> findBayisizKimdenList() {
        return new ResponseEntity<>(Arrays.asList(KimdenBayisiz.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KimdenMotosiklet>> findMotosikletKimdenList() {
        return new ResponseEntity<>(Arrays.asList(KimdenMotosiklet.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<KoltukSayisi>> findKoltukSayisiList() {
        return new ResponseEntity<>(Arrays.asList(KoltukSayisi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<MotorHacmi>> findMotorHacmiList() {
        return new ResponseEntity<>(Arrays.asList(MotorHacmi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<PlakaUyruk>> findPlakaUyrukList() {
        return new ResponseEntity<>(Arrays.asList(PlakaUyruk.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Renk>> findRenkList() {
        return new ResponseEntity<>(Arrays.asList(Renk.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<RuhsatKaydi>> findRuhsatKaydiList() {
        return new ResponseEntity<>(Arrays.asList(RuhsatKaydi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<SasiTipi>> findSasiTipiList() {
        return new ResponseEntity<>(Arrays.asList(SasiTipi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<SilindirSayisi>> findSilindirSayisiList() {
        return new ResponseEntity<>(Arrays.asList(SilindirSayisi.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Sogutma>> findSogutmaList() {
        return new ResponseEntity<>(Arrays.asList(Sogutma.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<VitesTuru>> findVitesTuruList() {
        return new ResponseEntity<>(Arrays.asList(VitesTuru.values()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<ZamanlamaTipi>> findZamanlamaTipiList() {
        return new ResponseEntity<>(Arrays.asList(ZamanlamaTipi.values()), HttpStatus.OK);
    }
}
