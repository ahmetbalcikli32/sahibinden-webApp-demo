package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
