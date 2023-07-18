package com.example.SoccerPredictionGame.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    /*
    Get a certain player depending on what is needed
     */
    @RequestMapping("/{id}")
    public Optional<Player> getOnePlayer(@PathVariable Long id) {
        return playerService.getOneOfPlayer(id);
    }

    @PostMapping
    public void registerPlayer(@RequestBody Player player) {
        playerService.addNewPlayer(player);
    }

}
