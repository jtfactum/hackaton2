package com.example.HakatonSpring.controller;

import com.example.HakatonSpring.accessingDataMySql.UserRepository;
import com.example.HakatonSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/login")
public class AuthController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/signin")
//    public Iterable<User> authenticateUser() {
//        return userRepository.findAll();
//    }
}
