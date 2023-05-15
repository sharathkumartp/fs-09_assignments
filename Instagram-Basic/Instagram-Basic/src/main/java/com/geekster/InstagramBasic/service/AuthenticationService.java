package com.geekster.InstagramBasic.service;

import com.geekster.InstagramBasic.model.AuthenticationToken;
import com.geekster.InstagramBasic.model.User;
import com.geekster.InstagramBasic.repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthenticationRepo authenticationRepo;

    public void save(AuthenticationToken token) {
        authenticationRepo.save(token);
    }

    public AuthenticationToken getToken(User user) {
        return authenticationRepo.findByUser(user);
    }
}
