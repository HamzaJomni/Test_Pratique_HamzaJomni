package com.example.testjomnimohamedhamza.DAO.RestControllers;

import com.example.testjomnimohamedhamza.DAO.Entitie.Composant;
import com.example.testjomnimohamedhamza.DAO.Services.ComposantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ComposantRestController {
    ComposantService composantService;
    @PostMapping("/composants")
    public Composant ajouterComposant(@RequestBody Composant composant) {
        return composantService.ajoutComposantsEtMiseAJourPrixTotalMenu(composant);
    }
}
