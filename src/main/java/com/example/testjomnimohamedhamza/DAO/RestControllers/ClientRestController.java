package com.example.testjomnimohamedhamza.DAO.RestControllers;

import com.example.testjomnimohamedhamza.DAO.Entitie.Client;
import com.example.testjomnimohamedhamza.DAO.Services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ClientRestController {

    IClientService iClientService;

    @PostMapping("addClient")
    public Client addClient(@RequestBody Client c) {
        return iClientService.ajouterClient(c);
    }
}
