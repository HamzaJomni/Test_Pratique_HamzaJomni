package com.example.testjomnimohamedhamza.DAO.Services;

import com.example.testjomnimohamedhamza.DAO.Entitie.Client;
import com.example.testjomnimohamedhamza.DAO.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepository clientRepository;
    @Override
    public Client ajouterClient(Client c) {
        return clientRepository.save(c);
    }
}
