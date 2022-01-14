package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.IlDTO;
import ahmet.balcikli.shoppingApp.dto.IlceDTO;
import ahmet.balcikli.shoppingApp.model.Il;
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
public class IlMapperImpl extends IlMapper {

    @Override
    public IlDTO entity2Dto(Il il) {
        if ( il == null ) {
            return null;
        }

        IlDTO ilDTO = new IlDTO();

        ilDTO.setId( il.getId() );
        ilDTO.setIlAdi( il.getIlAdi() );
        ilDTO.setIlceler( ilceListToIlceDTOList( il.getIlceler() ) );

        return ilDTO;
    }

    @Override
    public Il dto2Entity(IlDTO ilDTO) {
        if ( ilDTO == null ) {
            return null;
        }

        Il il = new Il();

        il.setId( ilDTO.getId() );
        il.setIlAdi( ilDTO.getIlAdi() );
        il.setIlceler( ilceDTOListToIlceList( ilDTO.getIlceler() ) );

        return il;
    }

    @Override
    public List<IlDTO> entityList2DtoList(List<Il> ilList) {
        if ( ilList == null ) {
            return null;
        }

        List<IlDTO> list = new ArrayList<IlDTO>( ilList.size() );
        for ( Il il : ilList ) {
            list.add( entity2Dto( il ) );
        }

        return list;
    }

    @Override
    public List<Il> dtoList2EntityList(List<IlDTO> ilDTOList) {
        if ( ilDTOList == null ) {
            return null;
        }

        List<Il> list = new ArrayList<Il>( ilDTOList.size() );
        for ( IlDTO ilDTO : ilDTOList ) {
            list.add( dto2Entity( ilDTO ) );
        }

        return list;
    }

    protected IlceDTO ilceToIlceDTO(Ilce ilce) {
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

    protected List<IlceDTO> ilceListToIlceDTOList(List<Ilce> list) {
        if ( list == null ) {
            return null;
        }

        List<IlceDTO> list1 = new ArrayList<IlceDTO>( list.size() );
        for ( Ilce ilce : list ) {
            list1.add( ilceToIlceDTO( ilce ) );
        }

        return list1;
    }

    protected Ilce ilceDTOToIlce(IlceDTO ilceDTO) {
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

    protected List<Ilce> ilceDTOListToIlceList(List<IlceDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Ilce> list1 = new ArrayList<Ilce>( list.size() );
        for ( IlceDTO ilceDTO : list ) {
            list1.add( ilceDTOToIlce( ilceDTO ) );
        }

        return list1;
    }
}
