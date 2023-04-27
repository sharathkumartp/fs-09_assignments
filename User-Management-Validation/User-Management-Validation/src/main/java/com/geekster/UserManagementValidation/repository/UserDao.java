package com.geekster.UserManagementValidation.repository;

import com.geekster.UserManagementValidation.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    List<User> users=new ArrayList<>();

    public boolean addUser(User user) {
        users.add(user);
        return true;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getById(int id) {
        for(User val:users){
            if(val.getUserId()==id){
                return val;
            }
        }
        return null;
    }

    public boolean updateUser(int id,User newUser) {
        User search=getById(id);
        search.setUserId(newUser.getUserId());
        search.setDate(newUser.getDate());
        search.setTime(newUser.getTime());
        search.setEmail(newUser.getEmail());
        search.setPhoneNumber(newUser.getPhoneNumber());
        search.setUsername(newUser.getUsername());
        search.setDateOfBirth(newUser.getDateOfBirth());
        return true;
    }

    public void deleteUser(int id) {
        for(int idx=0;idx<users.size();idx++){
            if(users.get(idx).getUserId()==id) users.remove(idx);
        }
    }
}
