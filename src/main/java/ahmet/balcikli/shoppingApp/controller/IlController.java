package ahmet.balcikli.shoppingApp.controller;

import ahmet.balcikli.shoppingApp.dto.IlDTO;
import ahmet.balcikli.shoppingApp.model.Il;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iller")
public interface IlController {

    @GetMapping
    List<IlDTO> findAllIlList();

    @GetMapping("/{id}")
    IlDTO findIlById(@PathVariable int id);
}
