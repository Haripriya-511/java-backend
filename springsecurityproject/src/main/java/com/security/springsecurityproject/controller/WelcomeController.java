package com.security.springsecurityproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application";
    }
}
