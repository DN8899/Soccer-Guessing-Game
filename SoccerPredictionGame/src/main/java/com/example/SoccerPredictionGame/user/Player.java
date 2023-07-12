package com.example.SoccerPredictionGame.user;

import jakarta.persistence.*;

/*
    Entity and Table is part of the Database connection
 */
@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
            )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long id;
    private String playerName;
    private String password;
    private Integer currency;

    Player() {
    }

    public Player(Long id,
                  String playerName,
                  String password,
                  Integer currency
                ) {
        this.playerName = playerName;
        this.password = password;
        this.currency = currency;
        this.id = id;
    }

    public Player(String playerName,
                  String password,
                  Integer currency
                ) {
        this.playerName = playerName;
        this.password = password;
        this.currency = currency;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String userName) {
        this.playerName = userName;
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
                ", playerName='" + playerName +
                '}';
    }
}
