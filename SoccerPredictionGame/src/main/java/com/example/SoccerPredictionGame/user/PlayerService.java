package com.example.SoccerPredictionGame.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerService {

    public List<Player> getPlayers() {
        return List.of(
                new Player(
                        1L,
                        "fakeName",
                        "fakePass",
                        0
                )
        );
    }

}
