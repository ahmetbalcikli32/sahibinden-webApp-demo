package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.PaketDTO;
import ahmet.balcikli.shoppingApp.dto.SeriDTO;
import ahmet.balcikli.shoppingApp.model.Paket;
import ahmet.balcikli.shoppingApp.model.Seri;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class PaketMapper {

    public abstract PaketDTO entity2Dto(Paket paket);

    public abstract Paket dto2Entity(PaketDTO paketDTO);

    public abstract List<PaketDTO> entityList2DtoList(List<Paket> paketList);

    public abstract List<Paket> dtoList2EntityList(List<PaketDTO> paketDTOList);
}
