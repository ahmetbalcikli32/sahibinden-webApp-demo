package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.OtomobilDTO;
import ahmet.balcikli.shoppingApp.model.Otomobil;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class OtomobilMapper {

    public abstract OtomobilDTO entity2Dto(Otomobil otomobil);

    public abstract Otomobil dto2Entity(OtomobilDTO otomobilDTO);

    public abstract List<OtomobilDTO> entityList2DtoList(List<Otomobil> otomobilList);

    public abstract List<Otomobil> dtoList2EntityList(List<OtomobilDTO> otomobilDTOList);

}
