package ahmet.balcikli.shoppingApp.service;

import ahmet.balcikli.shoppingApp.model.Marka;

import java.util.List;

public interface IMarkaService {

    List<Marka> findAll();

    List<Marka> findByAltKategori(int subCategoryId);

    Marka findById(int id);
}
