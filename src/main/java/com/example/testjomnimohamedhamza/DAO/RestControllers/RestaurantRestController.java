package com.example.testjomnimohamedhamza.DAO.RestControllers;

import com.example.testjomnimohamedhamza.DAO.Entitie.Restaurant;
import com.example.testjomnimohamedhamza.DAO.Services.IClientService;
import com.example.testjomnimohamedhamza.DAO.Services.IRestaurantService;
import com.example.testjomnimohamedhamza.DAO.Services.RestaurantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RestaurantRestController {
    IRestaurantService iRestaurantService;

    @PostMapping("/restaurants")
    public Restaurant ajouterRestauratnEtMenusAssocie(@RequestBody Restaurant restaurant) {
        return iRestaurantService.ajouterRestauratnEtMenusAssocie(restaurant);
    }

}
