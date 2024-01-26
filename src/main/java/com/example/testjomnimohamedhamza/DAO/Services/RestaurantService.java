package com.example.testjomnimohamedhamza.DAO.Services;

import com.example.testjomnimohamedhamza.DAO.Entitie.Menu;
import com.example.testjomnimohamedhamza.DAO.Entitie.Restaurant;
import com.example.testjomnimohamedhamza.DAO.Repository.MenuRepository;
import com.example.testjomnimohamedhamza.DAO.Repository.RestaurantRepository;

import java.util.List;

public class RestaurantService implements IRestaurantService{
    RestaurantRepository restaurantRepository;
    MenuRepository menuRepository;
    public Restaurant ajouterRestauratnEtMenusAssocie(Restaurant restaurant) {

        Restaurant restaurantEnregistre = restaurantRepository.save(restaurant);

        List<Menu> menus = restaurant.getMenus();
        menus.forEach(menu -> {
            menu.setRestaurant(restaurantEnregistre);
            menuRepository.save(menu);
        });
        return restaurantEnregistre;
    }

}
