package com.example.testjomnimohamedhamza.DAO.Services;

import com.example.testjomnimohamedhamza.DAO.Entitie.Menu;
import com.example.testjomnimohamedhamza.DAO.Repository.MenuRepository;

public class MenuService {
    MenuRepository menuRepository;
    public Menu updateMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}
