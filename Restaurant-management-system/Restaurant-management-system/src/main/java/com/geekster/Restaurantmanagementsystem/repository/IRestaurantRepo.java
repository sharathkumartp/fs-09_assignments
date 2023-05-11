package com.geekster.Restaurantmanagementsystem.repository;

import com.geekster.Restaurantmanagementsystem.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepo extends JpaRepository<Restaurant,Long> {

    public Restaurant save(Restaurant restaurant);

    Restaurant findRestaurantByName(String name);

    @Query(value = "delete restaurant from restaurant_table where restaurant_id =: id",nativeQuery = true)
    void deleteRestaurantById(Long id);
}
