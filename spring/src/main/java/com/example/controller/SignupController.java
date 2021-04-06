package com.example.controller;

import com.example.model.UserModel;
import com.example.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {
    @Autowired
    private UserRepo userrepo;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/signup")
    public boolean signup (@RequestBody UserModel user ){
        userrepo.save(user);
        return true;
    }
}
