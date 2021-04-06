package com.example.repository;

import com.example.model.OrderModel;

import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepo extends JpaRepository< OrderModel , String > {
    
}