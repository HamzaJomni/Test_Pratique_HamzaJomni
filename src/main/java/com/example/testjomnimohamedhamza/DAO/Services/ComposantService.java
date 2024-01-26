package com.example.testjomnimohamedhamza.DAO.Services;

import com.example.testjomnimohamedhamza.DAO.Entitie.Composant;
import com.example.testjomnimohamedhamza.DAO.Entitie.Menu;
import com.example.testjomnimohamedhamza.DAO.Repository.ComposantRepository;
import com.example.testjomnimohamedhamza.DAO.Repository.MenuRepository;

import java.util.Optional;
import java.util.Set;

public class ComposantService {
    MenuRepository menuRepository;
    ComposantRepository composantRepository;
    public Menu ajoutComposantsEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu) {
        Optional<Menu> menuOptional = menuRepository.findById(idMenu);
        if (menuOptional.isPresent()) {
            Menu menu = menuOptional.get();
            float prixTotal = menu.getPrixTotal();

            for (Composant composant : composants) {
                composant.setMenu(menu);
                prixTotal += composant.getPrix();
                composantRepository.save(composant);
            }

            menu.setPrixTotal(prixTotal);
            menuRepository.save(menu);
            return menu;
        } else {
            System.out.println("ce menu est introuvable : " + idMenu);
        }
    }

}
