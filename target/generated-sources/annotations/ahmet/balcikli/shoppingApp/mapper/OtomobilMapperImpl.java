package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.AdresDTO;
import ahmet.balcikli.shoppingApp.dto.IlanDTO;
import ahmet.balcikli.shoppingApp.dto.KategoriDTO;
import ahmet.balcikli.shoppingApp.dto.KisiDTO;
import ahmet.balcikli.shoppingApp.dto.KonumDTO;
import ahmet.balcikli.shoppingApp.dto.OtomobilDTO;
import ahmet.balcikli.shoppingApp.model.Adres;
import ahmet.balcikli.shoppingApp.model.AltKategori;
import ahmet.balcikli.shoppingApp.model.Ilan;
import ahmet.balcikli.shoppingApp.model.Kategori;
import ahmet.balcikli.shoppingApp.model.Kisi;
import ahmet.balcikli.shoppingApp.model.Konum;
import ahmet.balcikli.shoppingApp.model.Otomobil;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T02:20:31+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class OtomobilMapperImpl extends OtomobilMapper {

    @Override
    public OtomobilDTO entity2Dto(Otomobil otomobil) {
        if ( otomobil == null ) {
            return null;
        }

        OtomobilDTO otomobilDTO = new OtomobilDTO();

        otomobilDTO.setId( otomobil.getId() );
        otomobilDTO.setIlan( ilanToIlanDTO( otomobil.getIlan() ) );
        otomobilDTO.setKategori( kategoriToKategoriDTO( otomobil.getKategori() ) );

        return otomobilDTO;
    }

    @Override
    public Otomobil dto2Entity(OtomobilDTO otomobilDTO) {
        if ( otomobilDTO == null ) {
            return null;
        }

        Otomobil otomobil = new Otomobil();

        otomobil.setId( otomobilDTO.getId() );
        otomobil.setIlan( ilanDTOToIlan( otomobilDTO.getIlan() ) );
        otomobil.setKategori( kategoriDTOToKategori( otomobilDTO.getKategori() ) );

        return otomobil;
    }

    @Override
    public List<OtomobilDTO> entityList2DtoList(List<Otomobil> otomobilList) {
        if ( otomobilList == null ) {
            return null;
        }

        List<OtomobilDTO> list = new ArrayList<OtomobilDTO>( otomobilList.size() );
        for ( Otomobil otomobil : otomobilList ) {
            list.add( entity2Dto( otomobil ) );
        }

        return list;
    }

    @Override
    public List<Otomobil> dtoList2EntityList(List<OtomobilDTO> otomobilDTOList) {
        if ( otomobilDTOList == null ) {
            return null;
        }

        List<Otomobil> list = new ArrayList<Otomobil>( otomobilDTOList.size() );
        for ( OtomobilDTO otomobilDTO : otomobilDTOList ) {
            list.add( dto2Entity( otomobilDTO ) );
        }

        return list;
    }

    protected AdresDTO adresToAdresDTO(Adres adres) {
        if ( adres == null ) {
            return null;
        }

        AdresDTO adresDTO = new AdresDTO();

        adresDTO.setId( adres.getId() );
        adresDTO.setIl( adres.getIl() );
        adresDTO.setIlce( adres.getIlce() );
        adresDTO.setMahalle( adres.getMahalle() );

        return adresDTO;
    }

    protected KisiDTO kisiToKisiDTO(Kisi kisi) {
        if ( kisi == null ) {
            return null;
        }

        KisiDTO kisiDTO = new KisiDTO();

        kisiDTO.setId( kisi.getId() );
        kisiDTO.setAdi( kisi.getAdi() );
        kisiDTO.setSoyadi( kisi.getSoyadi() );
        kisiDTO.setUserName( kisi.getUserName() );
        kisiDTO.setTelefonNo( kisi.getTelefonNo() );

        return kisiDTO;
    }

    protected KonumDTO konumToKonumDTO(Konum konum) {
        if ( konum == null ) {
            return null;
        }

        KonumDTO konumDTO = new KonumDTO();

        konumDTO.setId( konum.getId() );
        konumDTO.setBoylam( konum.getBoylam() );
        konumDTO.setEnlem( konum.getEnlem() );
        konumDTO.setDogruluk( konum.getDogruluk() );

        return konumDTO;
    }

    protected IlanDTO ilanToIlanDTO(Ilan ilan) {
        if ( ilan == null ) {
            return null;
        }

        IlanDTO ilanDTO = new IlanDTO();

        ilanDTO.setId( ilan.getId() );
        ilanDTO.setBaslik( ilan.getBaslik() );
        ilanDTO.setIlanNo( ilan.getIlanNo() );
        ilanDTO.setIlanTarihi( ilan.getIlanTarihi() );
        ilanDTO.setAdres( adresToAdresDTO( ilan.getAdres() ) );
        ilanDTO.setKisi( kisiToKisiDTO( ilan.getKisi() ) );
        ilanDTO.setKonum( konumToKonumDTO( ilan.getKonum() ) );
        ilanDTO.setFiyat( ilan.getFiyat() );

        return ilanDTO;
    }

    protected KategoriDTO kategoriToKategoriDTO(Kategori kategori) {
        if ( kategori == null ) {
            return null;
        }

        KategoriDTO kategoriDTO = new KategoriDTO();

        kategoriDTO.setId( kategori.getId() );
        kategoriDTO.setAdi( kategori.getAdi() );
        List<AltKategori> list = kategori.getAltKategoriList();
        if ( list != null ) {
            kategoriDTO.setAltKategoriList( new ArrayList<AltKategori>( list ) );
        }

        return kategoriDTO;
    }

    protected Adres adresDTOToAdres(AdresDTO adresDTO) {
        if ( adresDTO == null ) {
            return null;
        }

        Adres adres = new Adres();

        adres.setId( adresDTO.getId() );
        adres.setIl( adresDTO.getIl() );
        adres.setIlce( adresDTO.getIlce() );
        adres.setMahalle( adresDTO.getMahalle() );

        return adres;
    }

    protected Kisi kisiDTOToKisi(KisiDTO kisiDTO) {
        if ( kisiDTO == null ) {
            return null;
        }

        Kisi kisi = new Kisi();

        kisi.setId( kisiDTO.getId() );
        kisi.setAdi( kisiDTO.getAdi() );
        kisi.setSoyadi( kisiDTO.getSoyadi() );
        kisi.setUserName( kisiDTO.getUserName() );
        kisi.setTelefonNo( kisiDTO.getTelefonNo() );

        return kisi;
    }

    protected Konum konumDTOToKonum(KonumDTO konumDTO) {
        if ( konumDTO == null ) {
            return null;
        }

        Konum konum = new Konum();

        konum.setId( konumDTO.getId() );
        konum.setBoylam( konumDTO.getBoylam() );
        konum.setEnlem( konumDTO.getEnlem() );
        konum.setDogruluk( konumDTO.getDogruluk() );

        return konum;
    }

    protected Ilan ilanDTOToIlan(IlanDTO ilanDTO) {
        if ( ilanDTO == null ) {
            return null;
        }

        Ilan ilan = new Ilan();

        ilan.setId( ilanDTO.getId() );
        ilan.setBaslik( ilanDTO.getBaslik() );
        ilan.setIlanNo( ilanDTO.getIlanNo() );
        ilan.setIlanTarihi( ilanDTO.getIlanTarihi() );
        ilan.setAdres( adresDTOToAdres( ilanDTO.getAdres() ) );
        ilan.setKisi( kisiDTOToKisi( ilanDTO.getKisi() ) );
        ilan.setKonum( konumDTOToKonum( ilanDTO.getKonum() ) );
        ilan.setFiyat( ilanDTO.getFiyat() );

        return ilan;
    }

    protected Kategori kategoriDTOToKategori(KategoriDTO kategoriDTO) {
        if ( kategoriDTO == null ) {
            return null;
        }

        Kategori kategori = new Kategori();

        kategori.setId( kategoriDTO.getId() );
        kategori.setAdi( kategoriDTO.getAdi() );
        List<AltKategori> list = kategoriDTO.getAltKategoriList();
        if ( list != null ) {
            kategori.setAltKategoriList( new ArrayList<AltKategori>( list ) );
        }

        return kategori;
    }
}
