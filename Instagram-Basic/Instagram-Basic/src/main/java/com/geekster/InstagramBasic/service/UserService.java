package com.geekster.InstagramBasic.service;

import com.geekster.InstagramBasic.dto.SignInInput;
import com.geekster.InstagramBasic.dto.SignInOutput;
import com.geekster.InstagramBasic.dto.SignUpInput;
import com.geekster.InstagramBasic.dto.SignUpOutput;
import com.geekster.InstagramBasic.model.AuthenticationToken;
import com.geekster.InstagramBasic.model.User;
import com.geekster.InstagramBasic.repository.IUserRepo;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    AuthenticationService authenticationService;

    public SignUpOutput signUp(SignUpInput signUpDto) {
        User user= userRepo.findFirstByEmail(signUpDto.getUserEmail());

        //check if user exists or not based on email
        if(user != null){
            throw new IllegalStateException("User already exists...!!! sign in instead");
        }

        //encryption
        String encryptedPassword=null;
        try {
             encryptedPassword = encryptPassword(signUpDto.getUserPassword());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        //save the user
        user= new User(signUpDto.getUserFirstName(),signUpDto.getUserLastName(),encryptedPassword,signUpDto.getUserEmail(),signUpDto.getUserContact());
        userRepo.save(user);

        //token creation and saving

        AuthenticationToken token= new AuthenticationToken(user);
        authenticationService.save(token);

        return new SignUpOutput("User registered","User created successfully");

    }

    private String encryptPassword(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md5= MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes(StandardCharsets.UTF_8));
        byte[] digested= md5.digest();

        String hash= DatatypeConverter.printHexBinary(digested);
        return hash;
    }


    public SignInOutput signIn(SignInInput signInDto) {
        User user= userRepo.findFirstByEmail(signInDto.getUserEmail());

        if (user == null) {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //encrypt the password

        String encryptedPassword = null;

        try {
            encryptedPassword = encryptPassword(signInDto.getUserPassword());
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //match it with database encrypted password

        boolean isPasswordValid = encryptedPassword.equals(user.getUserPassword());

        if(!isPasswordValid)
        {
            throw new IllegalStateException("User invalid!!!!...sign up instead");
        }

        //figure out the token

        AuthenticationToken authToken = authenticationService.getToken(user);

        //set up output response

        return new SignInOutput("Authentication Successfull !!!",authToken.getToken());
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }
}
