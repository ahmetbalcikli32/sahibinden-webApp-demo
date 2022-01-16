package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Marka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MarkaRepository extends JpaRepository<Marka, Integer> {

    Optional<List<Marka>> findByAltKategoriId(int subCategoryId);
}
