package com.example.SoccerPredictionGame.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
Repo used to access the data
 */
@Repository
public interface PlayerRepository
        extends JpaRepository<Player, Long> {
    Optional<Player> findPlayerByUserName(String userName);
}
