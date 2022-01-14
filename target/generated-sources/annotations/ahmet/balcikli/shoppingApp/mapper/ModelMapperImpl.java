package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.ModelDTO;
import ahmet.balcikli.shoppingApp.dto.PaketDTO;
import ahmet.balcikli.shoppingApp.model.Model;
import ahmet.balcikli.shoppingApp.model.Paket;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T02:24:31+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class ModelMapperImpl extends ModelMapper {

    @Override
    public ModelDTO entity2Dto(Model model) {
        if ( model == null ) {
            return null;
        }

        ModelDTO modelDTO = new ModelDTO();

        modelDTO.setId( model.getId() );
        modelDTO.setModelAdi( model.getModelAdi() );
        modelDTO.setPaketList( paketListToPaketDTOList( model.getPaketList() ) );

        return modelDTO;
    }

    @Override
    public Model dto2Entity(ModelDTO modelDTO) {
        if ( modelDTO == null ) {
            return null;
        }

        Model model = new Model();

        model.setId( modelDTO.getId() );
        model.setModelAdi( modelDTO.getModelAdi() );
        model.setPaketList( paketDTOListToPaketList( modelDTO.getPaketList() ) );

        return model;
    }

    @Override
    public List<ModelDTO> entityList2DtoList(List<Model> modelList) {
        if ( modelList == null ) {
            return null;
        }

        List<ModelDTO> list = new ArrayList<ModelDTO>( modelList.size() );
        for ( Model model : modelList ) {
            list.add( entity2Dto( model ) );
        }

        return list;
    }

    @Override
    public List<Model> dtoList2EntityList(List<ModelDTO> modelDTOList) {
        if ( modelDTOList == null ) {
            return null;
        }

        List<Model> list = new ArrayList<Model>( modelDTOList.size() );
        for ( ModelDTO modelDTO : modelDTOList ) {
            list.add( dto2Entity( modelDTO ) );
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
}
