package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String saveUser(User user) {
        userRepo.save(user);
        return "save user";
    }

    public User getUserById(Integer userId) {
        return userRepo.getUserById(userId);
    }
}
