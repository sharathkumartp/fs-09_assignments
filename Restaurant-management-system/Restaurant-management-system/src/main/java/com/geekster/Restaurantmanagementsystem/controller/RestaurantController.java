package com.geekster.Restaurantmanagementsystem.controller;

import com.geekster.Restaurantmanagementsystem.model.Restaurant;
import com.geekster.Restaurantmanagementsystem.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value = "/addRestaurant")
    public void createRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.createRestaurant(restaurant);
    }

    @GetMapping(value = "/fetchRestaurant")
    public Restaurant getRestaurant(@RequestParam String name){
        return restaurantService.fetchRestaurant(name);
    }

    @PutMapping(value = "/updateRestaurant/name/{name}")
    public ResponseEntity<String> updateRestaurant(@RequestBody Restaurant newRestaurant, @PathVariable String name){
        String response;
        HttpStatus status;
        try {
            restaurantService.updateRestaurant(newRestaurant, name);
            response="Restaurant updated successfully...!!!!";
            status=HttpStatus.ACCEPTED;
        }catch (Exception e){
            response="Restaurant with the name "+ name+" doesn't exist";
            status=HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<String>(response,status);
    }

    @DeleteMapping(value = "/remove/id/{id}")
    public void deleteRestaurant(@PathVariable Long id){
        restaurantService.deleteRestaurant(id);
    }
}
