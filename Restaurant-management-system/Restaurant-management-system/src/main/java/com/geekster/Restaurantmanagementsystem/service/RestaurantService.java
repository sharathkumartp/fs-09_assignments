package com.geekster.Restaurantmanagementsystem.service;

import com.geekster.Restaurantmanagementsystem.model.Restaurant;
import com.geekster.Restaurantmanagementsystem.repository.IRestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

@Service
public class RestaurantService {

    @Autowired
    IRestaurantRepo restaurantRepo;

    public void createRestaurant(Restaurant restaurant) {
        restaurantRepo.save(restaurant);
    }

    public Restaurant fetchRestaurant(String name) {
        return restaurantRepo.findRestaurantByName(name);
    }

    public void updateRestaurant(Restaurant newRestaurant, String name) {
        Restaurant restaurant=restaurantRepo.findRestaurantByName(name);
        if(restaurant != null){
            restaurant.setAddress(newRestaurant.getAddress());
            restaurant.setMenu(newRestaurant.getMenu());
            restaurant.setName(newRestaurant.getName());
            restaurantRepo.save(restaurant);
        }else {
            throw new InputMismatchException("Restaurant with the name " + name+ " doesn't exist!!!!");
        }

    }

    public void deleteRestaurant(Long id) {
        restaurantRepo.deleteRestaurantById(id);
    }
}
