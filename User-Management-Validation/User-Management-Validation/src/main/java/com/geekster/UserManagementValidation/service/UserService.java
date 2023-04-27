package com.geekster.UserManagementValidation.service;

import com.geekster.UserManagementValidation.model.User;
import com.geekster.UserManagementValidation.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public String addUser(User user) {
        boolean type= userDao.addUser(user);

        if(type){
            return "user added successfully..!!!";
        }else{
            return "failed to add...!!!!";
        }
    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getById(int id) {
        return userDao.getById(id);
    }

    public String updateUser(int id, User newUser) {
        boolean type=userDao.updateUser(id,newUser);
        if(type){
            return "user updated...!!!!";
        }else{
            return "update failed..!!!";
        }
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
