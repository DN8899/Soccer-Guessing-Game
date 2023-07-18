package com.example.SoccerPredictionGame.footballers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/footy")
public class FootballerController {
    private final FootballerService footballerService;
    @Autowired
    public FootballerController(FootballerService footballerService) {
        this.footballerService = footballerService;
    }

    @GetMapping
    public List<Footballer> getFootballers() {
        return footballerService.getFootballers();
    }
}
