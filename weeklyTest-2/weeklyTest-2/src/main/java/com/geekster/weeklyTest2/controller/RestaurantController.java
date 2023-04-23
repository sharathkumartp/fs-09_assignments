package com.geekster.weeklyTest2.controller;

import com.geekster.weeklyTest2.model.Restaurant;
import com.geekster.weeklyTest2.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant-app")

public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;



    //http://localhost:8080/api/v1/restaurant-app/add-restaurant

    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurants(){
        return restaurantService.findAll();
    }

    @GetMapping("/find-restaurant/name/{name}")
    public Restaurant findByName(@PathVariable String name){
        return restaurantService.findByName(name);
    }

    @DeleteMapping("/delete-restaurant/name/{name}")
    public void deleteRestaurant(@PathVariable String name){
        restaurantService.deleteRestaurant(name);
    }

    @PutMapping("update-restaurant/name/{name}")
    public void updateRestaurant(@PathVariable String name , @RequestBody Restaurant restaurant){
        restaurantService.updateRestaurant(name,restaurant);
    }
}
