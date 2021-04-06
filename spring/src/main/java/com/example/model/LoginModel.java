package com.example.model;
public class LoginModel{
    private String email;
    private String password;

    public LoginModel(final String mail,final String pswd){
        super();
        this.email=mail;
        this.password=pswd;
    }
    public String  getEmail(){
        return email;
    }
    public void setEmail(final String mail){
        this.email=mail;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(final String pswd){
        this.password=pswd;
    }
}
