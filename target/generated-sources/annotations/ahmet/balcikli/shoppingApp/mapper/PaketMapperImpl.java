package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.PaketDTO;
import ahmet.balcikli.shoppingApp.model.Paket;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T02:27:19+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class PaketMapperImpl extends PaketMapper {

    @Override
    public PaketDTO entity2Dto(Paket paket) {
        if ( paket == null ) {
            return null;
        }

        PaketDTO paketDTO = new PaketDTO();

        paketDTO.setId( paket.getId() );
        paketDTO.setPaketAdi( paket.getPaketAdi() );

        return paketDTO;
    }

    @Override
    public Paket dto2Entity(PaketDTO paketDTO) {
        if ( paketDTO == null ) {
            return null;
        }

        Paket paket = new Paket();

        paket.setId( paketDTO.getId() );
        paket.setPaketAdi( paketDTO.getPaketAdi() );

        return paket;
    }

    @Override
    public List<PaketDTO> entityList2DtoList(List<Paket> paketList) {
        if ( paketList == null ) {
            return null;
        }

        List<PaketDTO> list = new ArrayList<PaketDTO>( paketList.size() );
        for ( Paket paket : paketList ) {
            list.add( entity2Dto( paket ) );
        }

        return list;
    }

    @Override
    public List<Paket> dtoList2EntityList(List<PaketDTO> paketDTOList) {
        if ( paketDTOList == null ) {
            return null;
        }

        List<Paket> list = new ArrayList<Paket>( paketDTOList.size() );
        for ( PaketDTO paketDTO : paketDTOList ) {
            list.add( dto2Entity( paketDTO ) );
        }

        return list;
    }
}
