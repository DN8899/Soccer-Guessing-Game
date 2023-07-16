package com.example.SoccerPredictionGame;

import com.example.SoccerPredictionGame.player.Player;
import com.example.SoccerPredictionGame.player.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SoccerPredictionGameApplicationTests {
	PlayerRepository playerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void findPlayerNameTest() {

		assertEquals("FakeMan",playerRepository.findPlayerByUserName("FakeMan"));
	}

}
