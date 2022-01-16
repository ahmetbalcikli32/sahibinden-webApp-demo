package ahmet.balcikli.shoppingApp.controller.impl;

import ahmet.balcikli.shoppingApp.controller.IKategoriController;
import ahmet.balcikli.shoppingApp.dto.KategoriDTO;
import ahmet.balcikli.shoppingApp.mapper.KategoriMapper;
import ahmet.balcikli.shoppingApp.service.IKategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class KategoriControllerImpl implements IKategoriController {

    @Autowired
    private IKategoriService kategoriService;

    @Autowired
    private KategoriMapper kategoriMapper;

    @Override
    public List<KategoriDTO> findAll() {
        return kategoriMapper.entityList2DtoList(kategoriService.findAll());
    }

    @Override
    public KategoriDTO findById(int id) {
        return kategoriMapper.entity2Dto(kategoriService.findById(id));
    }
}
