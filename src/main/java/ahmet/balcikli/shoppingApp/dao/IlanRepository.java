package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Ilan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IlanRepository extends JpaRepository<Ilan, Long> {
}
