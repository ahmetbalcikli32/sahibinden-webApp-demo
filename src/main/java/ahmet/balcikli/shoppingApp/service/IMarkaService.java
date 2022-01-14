package ahmet.balcikli.shoppingApp.service;

import ahmet.balcikli.shoppingApp.model.Marka;

import java.util.List;

public interface IMarkaService {

    List<Marka> findAll();

    Marka findById(int id);
}
