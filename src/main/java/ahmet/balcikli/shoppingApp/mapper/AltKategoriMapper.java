package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.AltKategoriDTO;
import ahmet.balcikli.shoppingApp.model.AltKategori;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class AltKategoriMapper {

    public abstract AltKategoriDTO entity2Dto(AltKategori altKategori);

    public abstract AltKategori dto2Entity(AltKategoriDTO altKategoriDTO);

    public abstract List<AltKategoriDTO> entityList2DtoList(List<AltKategori> altKategoriList);

    public abstract List<AltKategori> dtoList2EntityList(List<AltKategoriDTO> altKategoriDTOList);
}
