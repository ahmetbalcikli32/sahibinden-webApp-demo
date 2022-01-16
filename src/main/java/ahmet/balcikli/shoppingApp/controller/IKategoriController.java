package ahmet.balcikli.shoppingApp.controller;

import ahmet.balcikli.shoppingApp.dto.KategoriDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin
public interface IKategoriController {

    @GetMapping
    List<KategoriDTO> findAll();

    @GetMapping("/{id}")
    KategoriDTO findById(@PathVariable int id);
}
