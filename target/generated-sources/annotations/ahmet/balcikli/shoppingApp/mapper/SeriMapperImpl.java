package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.ModelDTO;
import ahmet.balcikli.shoppingApp.dto.PaketDTO;
import ahmet.balcikli.shoppingApp.dto.SeriDTO;
import ahmet.balcikli.shoppingApp.model.Model;
import ahmet.balcikli.shoppingApp.model.Paket;
import ahmet.balcikli.shoppingApp.model.Seri;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T02:24:30+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class SeriMapperImpl extends SeriMapper {

    @Override
    public SeriDTO entity2Dto(Seri seri) {
        if ( seri == null ) {
            return null;
        }

        SeriDTO seriDTO = new SeriDTO();

        seriDTO.setId( seri.getId() );
        seriDTO.setSeriAdi( seri.getSeriAdi() );
        seriDTO.setModelList( modelListToModelDTOList( seri.getModelList() ) );

        return seriDTO;
    }

    @Override
    public Seri dto2Entity(SeriDTO seriDTO) {
        if ( seriDTO == null ) {
            return null;
        }

        Seri seri = new Seri();

        seri.setId( seriDTO.getId() );
        seri.setSeriAdi( seriDTO.getSeriAdi() );
        seri.setModelList( modelDTOListToModelList( seriDTO.getModelList() ) );

        return seri;
    }

    @Override
    public List<SeriDTO> entityList2DtoList(List<Seri> seriList) {
        if ( seriList == null ) {
            return null;
        }

        List<SeriDTO> list = new ArrayList<SeriDTO>( seriList.size() );
        for ( Seri seri : seriList ) {
            list.add( entity2Dto( seri ) );
        }

        return list;
    }

    @Override
    public List<Seri> dtoList2EntityList(List<SeriDTO> seriDTOList) {
        if ( seriDTOList == null ) {
            return null;
        }

        List<Seri> list = new ArrayList<Seri>( seriDTOList.size() );
        for ( SeriDTO seriDTO : seriDTOList ) {
            list.add( dto2Entity( seriDTO ) );
        }

        return list;
    }

    protected PaketDTO paketToPaketDTO(Paket paket) {
        if ( paket == null ) {
            return null;
        }

        PaketDTO paketDTO = new PaketDTO();

        paketDTO.setId( paket.getId() );
        paketDTO.setPaketAdi( paket.getPaketAdi() );

        return paketDTO;
    }

    protected List<PaketDTO> paketListToPaketDTOList(List<Paket> list) {
        if ( list == null ) {
            return null;
        }

        List<PaketDTO> list1 = new ArrayList<PaketDTO>( list.size() );
        for ( Paket paket : list ) {
            list1.add( paketToPaketDTO( paket ) );
        }

        return list1;
    }

    protected ModelDTO modelToModelDTO(Model model) {
        if ( model == null ) {
            return null;
        }

        ModelDTO modelDTO = new ModelDTO();

        modelDTO.setId( model.getId() );
        modelDTO.setModelAdi( model.getModelAdi() );
        modelDTO.setPaketList( paketListToPaketDTOList( model.getPaketList() ) );

        return modelDTO;
    }

    protected List<ModelDTO> modelListToModelDTOList(List<Model> list) {
        if ( list == null ) {
            return null;
        }

        List<ModelDTO> list1 = new ArrayList<ModelDTO>( list.size() );
        for ( Model model : list ) {
            list1.add( modelToModelDTO( model ) );
        }

        return list1;
    }

    protected Paket paketDTOToPaket(PaketDTO paketDTO) {
        if ( paketDTO == null ) {
            return null;
        }

        Paket paket = new Paket();

        paket.setId( paketDTO.getId() );
        paket.setPaketAdi( paketDTO.getPaketAdi() );

        return paket;
    }

    protected List<Paket> paketDTOListToPaketList(List<PaketDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Paket> list1 = new ArrayList<Paket>( list.size() );
        for ( PaketDTO paketDTO : list ) {
            list1.add( paketDTOToPaket( paketDTO ) );
        }

        return list1;
    }

    protected Model modelDTOToModel(ModelDTO modelDTO) {
        if ( modelDTO == null ) {
            return null;
        }

        Model model = new Model();

        model.setId( modelDTO.getId() );
        model.setModelAdi( modelDTO.getModelAdi() );
        model.setPaketList( paketDTOListToPaketList( modelDTO.getPaketList() ) );

        return model;
    }

    protected List<Model> modelDTOListToModelList(List<ModelDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Model> list1 = new ArrayList<Model>( list.size() );
        for ( ModelDTO modelDTO : list ) {
            list1.add( modelDTOToModel( modelDTO ) );
        }

        return list1;
    }
}
