package com.example.testjomnimohamedhamza.DAO.Repository;

import com.example.testjomnimohamedhamza.DAO.Entitie.Menu;
import com.example.testjomnimohamedhamza.DAO.Entitie.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
