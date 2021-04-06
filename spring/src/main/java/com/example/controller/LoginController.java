package com.example.controller;

import com.example.model.LoginModel;
import com.example.model.UserModel;
import com.example.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class LoginController {
    @Autowired
    private  UserRepo userrepo;
 
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value="/login")
    public Boolean checkUser(@RequestBody final LoginModel login) {
        final UserModel user = userrepo.findByEmail(login.getEmail());
        try {
            if (user.getPassword().equals(login.getPassword())) {
                return true;
            }

        } catch (final NullPointerException e) {
            return false;
        } catch (final IllegalArgumentException e) {
            return false;
        }
        return false;
    }
}


