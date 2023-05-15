package com.geekster.InstagramBasic.controller;

import com.geekster.InstagramBasic.dto.SignInInput;
import com.geekster.InstagramBasic.dto.SignInOutput;
import com.geekster.InstagramBasic.dto.SignUpInput;
import com.geekster.InstagramBasic.dto.SignUpOutput;
import com.geekster.InstagramBasic.model.User;
import com.geekster.InstagramBasic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpDto){
        return userService.signUp(signUpDto);
    }

    @PostMapping(value = "/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){
        return userService.signIn(signInDto);
    }

    @PostMapping(value = "/updateUser")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

}
