package ahmet.balcikli.shoppingApp.controller.impl;

import ahmet.balcikli.shoppingApp.controller.IlceController;
import ahmet.balcikli.shoppingApp.dto.IlceDTO;
import ahmet.balcikli.shoppingApp.mapper.IlceMapper;
import ahmet.balcikli.shoppingApp.service.IlceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IlceControllerImpl implements IlceController {

    @Autowired
    private IlceService ilceService;

    @Autowired
    private IlceMapper ilceMapper;

    @Override
    public List<IlceDTO> findAllIlceList() {
        return ilceMapper.entityList2DtoList(ilceService.findAll());
    }

    @Override
    public List<IlceDTO> findByIlId(int ilId) {
        return ilceMapper.entityList2DtoList(ilceService.findByIlId(ilId));
    }

    @Override
    public IlceDTO findById(int id) {
        return ilceMapper.entity2Dto(ilceService.findById(id));
    }
}
