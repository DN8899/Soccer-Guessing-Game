package com.example.SoccerPredictionGame.player;

import jakarta.persistence.*;

/*
    Entity and Table is part of the Database connection
 */
@Entity
@Table
public class Player {

    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
            )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    @Id
    private Long id;
    private String userName;
    private String password;
    private Integer currency;

    Player() {
    }

    public Player(Long id,
                  String userName,
                  String password,
                  Integer currency
                ) {
        this.userName = userName;
        this.password = password;
        this.currency = currency;
        this.id = id;
    }

    public Player(String userName,
                  String password,
                  Integer currency
                ) {
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
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", currency=" + currency +
                ", playerName='" + userName +
                '}';
    }
}
