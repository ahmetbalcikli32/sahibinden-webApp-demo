package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Marka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkaRepository extends JpaRepository<Marka, Integer> {
}
