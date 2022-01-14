package ahmet.balcikli.shoppingApp.service.impl;

import ahmet.balcikli.shoppingApp.dao.IlRepository;
import ahmet.balcikli.shoppingApp.model.Il;
import ahmet.balcikli.shoppingApp.service.IlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IlServiceImpl implements IlService {

    @Autowired
    private IlRepository ilRepository;

    @Override
    public List<Il> findAllIlList() {
        return ilRepository.findAll();
    }

    @Override
    public Il findIlById(int id) {
        return ilRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " id'li il bulunamadı!"));
    }
}
