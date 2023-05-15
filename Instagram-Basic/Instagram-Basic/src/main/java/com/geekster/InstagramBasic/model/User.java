package com.geekster.InstagramBasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userPassword;
    private String email;
    private String phoneNumber;


    public User( String firstName, String lastName, String userPassword, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
