package com.example.repository;


import com.example.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository< UserModel, String >{
    UserModel findByEmail(String email);
}
