package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.ModelDTO;
import ahmet.balcikli.shoppingApp.dto.SeriDTO;
import ahmet.balcikli.shoppingApp.model.Model;
import ahmet.balcikli.shoppingApp.model.Seri;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class SeriMapper {

    public abstract SeriDTO entity2Dto(Seri seri);

    public abstract Seri dto2Entity(SeriDTO seriDTO);

    public abstract List<SeriDTO> entityList2DtoList(List<Seri> seriList);

    public abstract List<Seri> dtoList2EntityList(List<SeriDTO> seriDTOList);
}
