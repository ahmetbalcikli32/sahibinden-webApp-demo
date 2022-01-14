package ahmet.balcikli.shoppingApp.controller;

import ahmet.balcikli.shoppingApp.dto.MarkaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/markalar")
public interface IMarkaController {

    @GetMapping
    List<MarkaDTO> findAll();

    @GetMapping("/{id}")
    MarkaDTO findById(@PathVariable int id);
}
