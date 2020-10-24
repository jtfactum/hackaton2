package com.example.HakatonSpring.controller;

import com.example.HakatonSpring.accessingDataMySql.UserRepository;
import com.example.HakatonSpring.model.Rase;
import com.example.HakatonSpring.model.User;
import com.example.HakatonSpring.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("/raceGame")
public class RaceGameController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/startGame")
    public Rase startGame(@RequestParam String token, @RequestParam int idBar, @RequestParam int bet) {
        Rase rase = new Rase();
        Set<Double> doubles = rase.getDoubles();
        doubles.add(Math.random());
        doubles.add(Math.random());
        doubles.add(Math.random());
        doubles.add(Math.random());
        doubles.add(Math.random());
        double max = Collections.max(doubles);
        User user = userRepository.findByNameUser(new JwtUtils().getUserNameFromJwtToken(token)).get();
        int count = 0;
        for (Double dob : doubles) {
            if (dob == max && count == idBar) {
                user.setBalance(user.getBalance()+bet);
                rase.setWinLose(true);
                userRepository.save(user);
                return rase;
            }
        }
        user.setBalance(user.getBalance()-bet);
        rase.setWinLose(false);
        userRepository.save(user);
        return rase;
    }

}
