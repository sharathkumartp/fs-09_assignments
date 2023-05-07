package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query(value = "select * from product where id= :productId",nativeQuery = true)
   public Product getProductById(Integer productId);
}
