package com.example.SoccerPredictionGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SoccerPredictionGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoccerPredictionGameApplication.class, args);
	}
 @GetMapping
	public List<String> hello(){
		return List.of("Hi", "Bye");
	}

}
