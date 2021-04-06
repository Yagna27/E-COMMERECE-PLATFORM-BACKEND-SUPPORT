package com.example.model;

//import com.example.model.CartModel;
//import com.example.model.OrderModel;

//import com.example.model.CartModel;
import com.example.model.OrderModel;
import com.sun.istack.NotNull;
import org.apache.catalina.User;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;


@Entity
@Table(name="users") //creation of table
public class UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="email_id", nullable = false)
    private String email;

    @NotNull
    @Column(name="pswd", nullable = false)
    private String password;

    @NotNull
    @Column(name="username", nullable = true)
    private String username;

    @NotNull
    @Column(name="mobile_no", nullable = false)
    private String mobileNumber;

    @NotNull
    @Column(name="role", columnDefinition = "varchar(255) default 'USER'")
    private String role;

    @Column(columnDefinition = "boolean default true")
    private Boolean active;

//    @OneToMany
//    @PrimaryKeyJoinColumn
//    private List<OrderModel> ordersList = new ArrayList<OrderModel>();

//    public UserModel() {
//
//    }

    public UserModel(final String mail, final String uname, final String pswd, final String num) {
        super();
        this.email = mail;
        this.username = uname;
        this.password = pswd;
        this.mobileNumber = num;
        this.active = true;
        this.role = "USER";
    }

    public String getUserName() {
        return username;
    }

    public Boolean getActive() {
        return true;
    }

    public void setActive(final Boolean active) {
        this.active = true;
    }

    public void setUserName(final String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String mail) {
        this.email = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String pswd) {
        this.password = pswd;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(final String num) {
        this.mobileNumber = num;
    }

    public String getRole() {
        return "USER";
    }

    public void setRole(final String r) {
        this.role = "USER";
    }

//     public CartModel getCart() {
//         return cart;
//     }
//
//     public void setCart(final CartModel cart) {
//         this.cart = cart;
//     }
//
//     public List<OrderModel> getOrdersList() {
//         return ordersList;
//     }
//
//     public void setOrdersList(final List<OrderModel> ordersList) {
//        this.ordersList = ordersList;
//     }
}

