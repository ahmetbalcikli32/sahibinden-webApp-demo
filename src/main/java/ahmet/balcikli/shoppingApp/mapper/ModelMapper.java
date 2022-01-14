package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.ModelDTO;
import ahmet.balcikli.shoppingApp.model.Model;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ModelMapper {

    public abstract ModelDTO entity2Dto(Model model);

    public abstract Model dto2Entity(ModelDTO modelDTO);

    public abstract List<ModelDTO> entityList2DtoList(List<Model> modelList);

    public abstract List<Model> dtoList2EntityList(List<ModelDTO> modelDTOList);
}
