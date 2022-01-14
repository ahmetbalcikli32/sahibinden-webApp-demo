package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.IlceDTO;
import ahmet.balcikli.shoppingApp.model.Ilce;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class IlceMapper {

    public abstract IlceDTO entity2Dto(Ilce ilce);

    public abstract Ilce dto2Entity(IlceDTO ilceDTO);

    public abstract List<IlceDTO> entityList2DtoList(List<Ilce> ilceList);

    public abstract List<Ilce> dtoList2EntityList(List<IlceDTO> ilceDTOList);

}
