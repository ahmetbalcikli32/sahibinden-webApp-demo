package ahmet.balcikli.shoppingApp.controller;

import ahmet.balcikli.shoppingApp.dto.IlceDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ilceler")
public interface IlceController {

    @GetMapping
    List<IlceDTO> findAllIlceList();

    @GetMapping(params = "il_id")
    List<IlceDTO> findByIlId(@RequestParam("il_id") int ilId);

    @GetMapping(params = "id")
    IlceDTO findById(@RequestParam("id") int id);
}
