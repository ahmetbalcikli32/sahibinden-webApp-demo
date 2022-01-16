package ahmet.balcikli.shoppingApp.service;

import ahmet.balcikli.shoppingApp.model.Kategori;

import java.util.List;

public interface IKategoriService {

    List<Kategori> findAll();
    Kategori findById(int id);
}
