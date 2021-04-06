package com.example.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderModel {
    @Id
    @GenericGenerator(name = "id", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true)
    private long id;

    @Column( nullable = false )
    String user_id;

    @Column( nullable = false )
    String ProductName;

    @Column(nullable = false)
    int quantity;

    @Column(nullable = false)
    String totalPrice;

    @Column(nullable = false)
    String Status;

    @Column(nullable = false)
    String Price;


    public OrderModel(String userId, String productName, int quantity, String totalPrice, String status, String price) {
        super();
        this.user_id= userId;
        ProductName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        Status = status;
        Price = price;
    }

    public String getUserId() {
        return user_id;
    }
    public void setUserId(String userId) {
        this.user_id = userId;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }
}
