package ahmet.balcikli.shoppingApp.service.impl;

import ahmet.balcikli.shoppingApp.dao.IlceRepository;
import ahmet.balcikli.shoppingApp.model.Ilce;
import ahmet.balcikli.shoppingApp.service.IlceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IlceServiceImpl implements IlceService {

    @Autowired
    private IlceRepository ilceRepository;

    @Override
    public List<Ilce> findAll() {
        return ilceRepository.findAll();
    }

    @Override
    public List<Ilce> findByIlId(int ilId) {
        return ilceRepository.findByIlId(ilId).orElseThrow(() -> new EntityNotFoundException(ilId + " il id'li ilçe bulunamadı!"));
    }

    @Override
    public Ilce findById(int id) {
        return ilceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " id'li ilçe bulunamadı!"));
    }
}
