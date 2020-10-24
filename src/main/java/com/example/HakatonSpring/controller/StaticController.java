package com.example.HakatonSpring.controller;

import com.example.HakatonSpring.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StaticController {

    @GetMapping("/")
    public String homePage(Model model){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        User user = (User) authentication.getPrincipal();
//        model.addAttribute("welcome", "Welcome " + user.getEmail() + "!");
        return "sign-in";
    }
    /**
     * Login
     */
    @GetMapping(value = "/home")
    public String login(Model model) {
        return "HomePage";
    }

    @GetMapping(value = "/sign-up")
    public String signUp(Model model) {
        return "sign-up";
    }

}
