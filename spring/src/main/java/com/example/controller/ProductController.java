package com.example.controller;

import com.example.model.ProductModel;
import com.example.model.UserModel;
import com.example.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.*;


@RestController
public class ProductController {
    @Autowired
    private ProductRepo productrepo;


    //helps the admin to fetch all products from database
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/admin")
    public List<ProductModel> getProduct(){
        return  productrepo.findAll();
    }

    //helps to retrive all the products from database
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/home")
    public List<ProductModel> getHomeProduct(){
        return  productrepo.findAll();
    }

    //to retrive a product using product id
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/admin/productEdit/{productId}")
    public ProductModel productEditData(@PathVariable("productId") String id){
        ProductModel product=productrepo.findById(id).orElse(null);
        return product;
    }

    //to edit a product and save to db
    @PostMapping("/admin/productEdit/{productId}")
    public void productEditSave(@PathVariable("productId") String id){
            ProductModel product=productrepo.findById(id).orElse(null);
            productrepo.save(product);
    }

    //to add a new product to db.
    @PostMapping(value ="/admin/addProduct")
    public String productSave(@RequestBody ProductModel product) {
      productrepo.save(product);
      return "Product Added";
    }

    //to delete a product from db
    @GetMapping("/admin/delete/{productId} ")
    public void productDelete(@PathVariable("productId") String id){
        ProductModel product = productrepo.findById(id).orElse(null);
        productrepo.delete(product);
    }
}
