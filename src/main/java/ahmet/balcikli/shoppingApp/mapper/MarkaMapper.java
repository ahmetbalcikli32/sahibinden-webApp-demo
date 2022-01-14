package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.MarkaDTO;
import ahmet.balcikli.shoppingApp.model.Marka;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class MarkaMapper {

    public abstract MarkaDTO entity2Dto(Marka marka);

    public abstract Marka dto2Entity(MarkaDTO markaDTO);

    public abstract List<MarkaDTO> entityList2DtoList(List<Marka> ilceList);

    public abstract List<Marka> dtoList2EntityList(List<MarkaDTO> markaDTOList);
}
