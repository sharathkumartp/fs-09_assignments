package com.geekster.userManSystem.controller;

import com.geekster.userManSystem.model.User;
import com.geekster.userManSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping(value = "/getAll")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getById/Id/{Id}")
    public User getUserById(@PathVariable int Id){
        return userService.getById(Id);
    }

    @PostMapping(value = "/updateUser/Id/{Id}")
    public String updateUser(@PathVariable int Id,@RequestBody User newUser){
        return userService.updateUser(Id,newUser);
    }

    @DeleteMapping(value = "/deleteUser/Id/{Id}")
    public void deleteById(@PathVariable int Id){
         userService.deleteUser(Id);
    }
}
