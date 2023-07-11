package com.example.SoccerPredictionGame.user;

public class User {
    private String userName;
    private String password;
    private Integer currency;
    private Long id;

    User() {
    }

    public User(Long id,
                String userName,
                String password,
                Integer currency
                ) {
        this.userName = userName;
        this.password = password;
        this.currency = currency;
        this.id = id;
    }

    public User(String userName,
                String password,
                Integer currency) {
        this.userName = userName;
        this.password = password;
        this.currency = currency;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", currency=" + currency +
                ", id=" + id +
                '}';
    }
}
