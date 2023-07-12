package com.example.SoccerPredictionGame.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/soccer")
public class PlayerController {

    private final PlayerService playerService;
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping
    public void registerPlayer(@RequestBody Player player) {
        playerService.addNewPlayer(player);
    }

}