package com.geekster.InstagramBasic.repository;


import com.geekster.InstagramBasic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
    public User findFirstByEmail(String userEmail) ;
}
