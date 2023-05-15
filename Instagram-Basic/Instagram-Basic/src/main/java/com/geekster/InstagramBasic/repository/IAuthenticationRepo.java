package com.geekster.InstagramBasic.repository;

import com.geekster.InstagramBasic.model.AuthenticationToken;
import com.geekster.InstagramBasic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByUser(User user);
}
