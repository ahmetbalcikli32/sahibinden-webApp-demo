package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.IlDTO;
import ahmet.balcikli.shoppingApp.model.Il;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class IlMapper {

    public abstract IlDTO entity2Dto(Il il);

    public abstract Il dto2Entity(IlDTO ilDTO);

    public abstract List<IlDTO> entityList2DtoList(List<Il> ilList);

    public abstract List<Il> dtoList2EntityList(List<IlDTO> ilDTOList);
}
