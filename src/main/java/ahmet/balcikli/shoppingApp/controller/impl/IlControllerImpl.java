package ahmet.balcikli.shoppingApp.controller.impl;

import ahmet.balcikli.shoppingApp.controller.IlController;
import ahmet.balcikli.shoppingApp.dto.IlDTO;
import ahmet.balcikli.shoppingApp.mapper.IlMapper;
import ahmet.balcikli.shoppingApp.service.IlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class IlControllerImpl implements IlController {

    @Autowired
    private IlService ilService;

    @Autowired
    private IlMapper ilMapper;

    @Override
    public List<IlDTO> findAllIlList() {
        /////////// Çalışma Zamanı Hesaplama /////////////
//        long startTime = System.nanoTime();
//        List<IlDTO> ilDTO = ilMapper.entityList2DtoList(ilService.findAllIlList());
//        long endTime = System.nanoTime();
//        long totalTime = endTime - startTime;
//        System.out.println(totalTime);
//        return ilDTO;
        return ilMapper.entityList2DtoList(ilService.findAllIlList());
    }

    @Override
    public IlDTO findIlById(int id) {
        return ilMapper.entity2Dto(ilService.findIlById(id));
    }
}
