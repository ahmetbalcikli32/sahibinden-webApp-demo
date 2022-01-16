package ahmet.balcikli.shoppingApp.controller;

import ahmet.balcikli.shoppingApp.dto.MarkaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markalar")
public interface IMarkaController {

    @GetMapping
    List<MarkaDTO> findAll();

    @GetMapping(params = "subcategory_id")
    List<MarkaDTO> findByAltKategoriId(@RequestParam("subcategory_id") int subCategoryId);

    @GetMapping("/{id}")
    MarkaDTO findById(@PathVariable int id);
}
