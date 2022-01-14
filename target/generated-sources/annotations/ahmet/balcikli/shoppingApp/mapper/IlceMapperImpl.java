package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.IlceDTO;
import ahmet.balcikli.shoppingApp.model.Ilce;
import ahmet.balcikli.shoppingApp.model.Mahalle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T00:17:58+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class IlceMapperImpl extends IlceMapper {

    @Override
    public IlceDTO entity2Dto(Ilce ilce) {
        if ( ilce == null ) {
            return null;
        }

        IlceDTO ilceDTO = new IlceDTO();

        ilceDTO.setId( ilce.getId() );
        ilceDTO.setIlceAdi( ilce.getIlceAdi() );
        List<Mahalle> list = ilce.getMahalleler();
        if ( list != null ) {
            ilceDTO.setMahalleler( new ArrayList<Mahalle>( list ) );
        }

        return ilceDTO;
    }

    @Override
    public Ilce dto2Entity(IlceDTO ilceDTO) {
        if ( ilceDTO == null ) {
            return null;
        }

        Ilce ilce = new Ilce();

        ilce.setId( ilceDTO.getId() );
        ilce.setIlceAdi( ilceDTO.getIlceAdi() );
        List<Mahalle> list = ilceDTO.getMahalleler();
        if ( list != null ) {
            ilce.setMahalleler( new ArrayList<Mahalle>( list ) );
        }

        return ilce;
    }

    @Override
    public List<IlceDTO> entityList2DtoList(List<Ilce> ilceList) {
        if ( ilceList == null ) {
            return null;
        }

        List<IlceDTO> list = new ArrayList<IlceDTO>( ilceList.size() );
        for ( Ilce ilce : ilceList ) {
            list.add( entity2Dto( ilce ) );
        }

        return list;
    }

    @Override
    public List<Ilce> dtoList2EntityList(List<IlceDTO> ilceDTOList) {
        if ( ilceDTOList == null ) {
            return null;
        }

        List<Ilce> list = new ArrayList<Ilce>( ilceDTOList.size() );
        for ( IlceDTO ilceDTO : ilceDTOList ) {
            list.add( dto2Entity( ilceDTO ) );
        }

        return list;
    }
}
