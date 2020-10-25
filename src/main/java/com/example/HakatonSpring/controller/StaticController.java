package com.example.HakatonSpring.controller;

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
        return "myAccount";
    }

    @GetMapping(value = "/sign-up")
    public String signUp(Model model) {
        return "sign-up";
    }

    @GetMapping(value = "/myAccount")
    public String myAccount(Module model) {
        return "myAccount";
    }

}
