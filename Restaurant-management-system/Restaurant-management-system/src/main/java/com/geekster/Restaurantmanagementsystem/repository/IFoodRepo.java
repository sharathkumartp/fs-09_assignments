package com.geekster.Restaurantmanagementsystem.repository;

import com.geekster.Restaurantmanagementsystem.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends JpaRepository<Food,Long> {
    Food save(Food food);

    Food findFoodByName(String name);

    @Query(value = "delete food from food_tbl where food_id= : id",nativeQuery = true)
    void deleteFoodByName(Long id);
}
