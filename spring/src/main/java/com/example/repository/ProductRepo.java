package com.example.repository;

import com.example.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepo extends JpaRepository<ProductModel,String>{
    
}