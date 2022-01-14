package ahmet.balcikli.shoppingApp.dao;

import ahmet.balcikli.shoppingApp.model.Ilce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IlceRepository extends JpaRepository<Ilce, Integer> {

    Optional<List<Ilce>> findByIlId(int ilId);
}
