package ahmet.balcikli.shoppingApp.service.impl;

import ahmet.balcikli.shoppingApp.dao.KategoriRepository;
import ahmet.balcikli.shoppingApp.model.Kategori;
import ahmet.balcikli.shoppingApp.service.IKategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class KategoriServiceImpl implements IKategoriService {

    @Autowired
    private KategoriRepository kategoriRepository;

    @Override
    public List<Kategori> findAll() {
        return kategoriRepository.findAll();
    }

    @Override
    public Kategori findById(int id) {
        return kategoriRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " id'li kategori bulunamadı!"));
    }
}
