package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Seri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriRepository extends JpaRepository<Seri, Integer> {
}
