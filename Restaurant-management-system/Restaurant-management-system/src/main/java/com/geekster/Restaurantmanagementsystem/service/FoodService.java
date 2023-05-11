package com.geekster.Restaurantmanagementsystem.service;

import com.geekster.Restaurantmanagementsystem.model.Food;
import com.geekster.Restaurantmanagementsystem.repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    IFoodRepo foodRepo;

    public void addFood(Food food) {
        foodRepo.save(food);
    }

    public Food getByName(String name) {
        return foodRepo.findFoodByName(name);
    }

    public void deleteFood(Long id) {
        foodRepo.deleteFoodByName(id);
    }
}
