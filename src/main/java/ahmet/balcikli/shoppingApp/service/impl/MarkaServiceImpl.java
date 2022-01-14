package ahmet.balcikli.shoppingApp.service.impl;

import ahmet.balcikli.shoppingApp.dao.MarkaRepository;
import ahmet.balcikli.shoppingApp.model.Marka;
import ahmet.balcikli.shoppingApp.service.IMarkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MarkaServiceImpl implements IMarkaService {

    @Autowired
    private MarkaRepository markaRepository;

    @Override
    public List<Marka> findAll() {
        return markaRepository.findAll();
    }

    @Override
    public Marka findById(int id) {
        return markaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " id'li marka bulunamadı!"));
    }
}
