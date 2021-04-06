/*package com.example.controller;


import com.example.repository.CartRepo;
import com.example.repository.ProductRepo;
import com.example.model.CartModel;
import com.example.model.ProductModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@RestController
public class CartController {


    @Autowired
    private CartRepo cartrepo;

    //to add product to cart
    @PostMapping("/home/{productId} ")
    public void addToCart(String Quantity,String id){
        ProductModel product=productrepo.findById(id).orElse(null);

    }

    //to view the cart items
    @GetMapping("/cart/{CartItem_Id} ")
    public List<CartModel> showCart(@PathVariable("CartItem_Id") String id){
        return 
    }

    //helps to delete a product from cart
    public void deleteCartItem(String id){

    }

}
*/