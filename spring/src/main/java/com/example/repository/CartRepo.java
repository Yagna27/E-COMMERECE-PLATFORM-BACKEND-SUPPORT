package com.example.repository;

import com.example.model.CartModel;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CartRepo extends JpaRepository< CartModel , String > {
    
}