package com.geekster.userManSystem.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
    private int UserId;
    @NotEmpty(message = "Name cannot be empty")
    private String Name;
    @NotEmpty
    @Email
    private String UserName;
    private String Address;
    @Size(min = 10,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String  PhoneNumber;

    public User(int UserId, String Name, String UserName, String Address, String PhoneNumber) {
       this.UserId = UserId;
        this.Name = Name;
        this.UserName = UserName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }


    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
