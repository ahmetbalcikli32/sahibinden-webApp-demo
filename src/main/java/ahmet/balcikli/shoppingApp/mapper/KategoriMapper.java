package ahmet.balcikli.shoppingApp.mapper;

import ahmet.balcikli.shoppingApp.dto.KategoriDTO;
import ahmet.balcikli.shoppingApp.model.Kategori;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class KategoriMapper {

    public abstract KategoriDTO entity2Dto(Kategori kategori);

    public abstract Kategori dto2Entity(KategoriDTO kategoriDTO);

    public abstract List<KategoriDTO> entityList2DtoList(List<Kategori> kategoriList);

    public abstract List<Kategori> dtoList2EntityList(List<KategoriDTO> kategoriDTOList);
}
