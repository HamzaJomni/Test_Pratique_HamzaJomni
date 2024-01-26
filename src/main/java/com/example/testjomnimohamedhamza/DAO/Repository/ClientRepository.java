package com.example.testjomnimohamedhamza.DAO.Repository;

import com.example.testjomnimohamedhamza.DAO.Entitie.Client;
import com.example.testjomnimohamedhamza.DAO.Entitie.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
