package com.example.SoccerPredictionGame.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    /*
    Needed to find all players in database
     */
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getOneOfPlayer(Long id) {
        return playerRepository.findById(id);
    }

    public void addNewPlayer(Player player) {
        System.out.println(player);
    }


}
