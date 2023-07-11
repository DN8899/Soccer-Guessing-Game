package com.example.SoccerPredictionGame.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "fakeName",
                        "fakePass",
                        0
                )
        );
    }

}
