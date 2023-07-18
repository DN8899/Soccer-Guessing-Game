package com.example.SoccerPredictionGame.footballers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballerRepository
        extends JpaRepository<Footballer, Long> {

}
