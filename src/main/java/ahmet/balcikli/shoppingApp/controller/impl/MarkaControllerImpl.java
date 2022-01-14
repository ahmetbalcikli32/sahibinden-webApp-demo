package ahmet.balcikli.shoppingApp.controller.impl;

import ahmet.balcikli.shoppingApp.controller.IMarkaController;
import ahmet.balcikli.shoppingApp.dto.MarkaDTO;
import ahmet.balcikli.shoppingApp.mapper.MarkaMapper;
import ahmet.balcikli.shoppingApp.service.IMarkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MarkaControllerImpl implements IMarkaController {

    @Autowired
    private IMarkaService markaService;

    @Autowired
    private MarkaMapper markaMapper;

    @Override
    public List<MarkaDTO> findAll() {
        return markaMapper.entityList2DtoList(markaService.findAll());
    }

    @Override
    public MarkaDTO findById(int id) {
        return markaMapper.entity2Dto(markaService.findById(id));
    }
}
