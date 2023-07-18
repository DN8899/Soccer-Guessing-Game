package com.example.SoccerPredictionGame.player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {
    //@Bean
    CommandLineRunner commandLineRunner(
            PlayerRepository repository) {
        return args -> {
            Player FakeMan = new Player(
                    "FakeName",
                    "FakePassword",
                    0
            );
            Player FakeWoman = new Player(
                    "FakeWoman",
                    "FakerPassword",
                    0
            );
            repository.saveAll(
                    List.of(FakeMan, FakeWoman)
            );
        };
    }
}
