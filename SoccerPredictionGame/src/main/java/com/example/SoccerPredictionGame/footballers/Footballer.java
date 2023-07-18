package com.example.SoccerPredictionGame.footballers;

import jakarta.persistence.*;

@Entity
@Table
public class Footballer {
    @SequenceGenerator(
            name = "footballer_sequence",
            sequenceName = "footballer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "footballer_sequence"
    )
    @Id
    private Long id;
    private String name;
    private int overall;
    private int pace;
    private int shooting;
    private int passing;
    private int defending;

    Footballer() {
    }

    public Footballer(Long id,
                      String name,
                      int overall,
                      int pace,
                      int shooting,
                      int passing,
                      int defending) {
        this.id = id;
        this.name = name;
        this.overall = overall;
        this.pace = pace;
        this.shooting = shooting;
        this.passing = passing;
        this.defending = defending;
    }

    public Footballer(String name,
                      int overall,
                      int pace,
                      int shooting,
                      int passing,
                      int defending) {
        this.name = name;
        this.overall = overall;
        this.pace = pace;
        this.shooting = shooting;
        this.passing = passing;
        this.defending = defending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    @Override
    public String toString() {
        return "Footballers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", overall=" + overall +
                ", pace=" + pace +
                ", shooting=" + shooting +
                ", passing=" + passing +
                ", defending=" + defending +
                '}';
    }
}
