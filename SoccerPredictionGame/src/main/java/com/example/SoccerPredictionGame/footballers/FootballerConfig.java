package com.example.SoccerPredictionGame.footballers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FootballerConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            FootballerRepository repository) {
        return args -> {
            Footballer Derrick = new Footballer(
                        "Derrick",
                        99,
                        99,
                        50,
                        80,
                        50
            );
            Footballer Michael = new Footballer(
                    "Michael",
                    99,
                    80,
                    65,
                    70,
                    81
            );
            repository.saveAll(
                    List.of(Derrick, Michael));
        };
    }
}
