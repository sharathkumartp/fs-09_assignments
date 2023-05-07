package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "select * from user where id= :userId",nativeQuery = true)
  public User getUserById(Integer userId);
}
