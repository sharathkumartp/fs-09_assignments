package com.geekster.Restaurantmanagementsystem.controller;

import com.geekster.Restaurantmanagementsystem.model.Food;
import com.geekster.Restaurantmanagementsystem.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    @PostMapping(value = "/addFood")
    public void addFood(@RequestBody Food food){
        foodService.addFood(food);
    }

    @GetMapping(value = "/getFood/name/{name}")
    public Food getFoodByName(@PathVariable String name){
        return foodService.getByName(name);
    }

    @DeleteMapping(value = "/removeFood/id/{id}")
    public void deleteFoodByName(@PathVariable Long id){
        foodService.deleteFood(id);
    }

}
