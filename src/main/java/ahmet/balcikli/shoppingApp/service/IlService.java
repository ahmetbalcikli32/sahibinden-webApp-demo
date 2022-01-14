package ahmet.balcikli.shoppingApp.service;

import ahmet.balcikli.shoppingApp.model.Il;

import java.util.List;

public interface IlService {

    List<Il> findAllIlList();
    Il findIlById(int id);
}
