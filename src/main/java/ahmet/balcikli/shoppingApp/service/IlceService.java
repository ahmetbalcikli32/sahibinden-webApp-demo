package ahmet.balcikli.shoppingApp.service;

import ahmet.balcikli.shoppingApp.model.Ilce;

import java.util.List;

public interface IlceService {

    List<Ilce> findAll();
    List<Ilce> findByIlId(int ilId);
    Ilce findById(int id);
}
