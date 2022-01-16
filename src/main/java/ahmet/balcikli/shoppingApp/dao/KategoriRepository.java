package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriRepository extends JpaRepository<Kategori, Integer> {
}
