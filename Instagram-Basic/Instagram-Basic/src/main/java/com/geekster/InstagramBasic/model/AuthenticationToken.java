package com.geekster.InstagramBasic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tokenId;
    private String token;
    private LocalDate tokenCreationDate;


    @OneToOne
    @JoinColumn(name = "fk_userID",nullable = false)
    private  User user;

    public AuthenticationToken(User user){
        this.user=user;
        this.token= UUID.randomUUID().toString();
        this.tokenCreationDate=LocalDate.now();
    }
}
