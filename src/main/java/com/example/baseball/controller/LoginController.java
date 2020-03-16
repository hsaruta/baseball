package com.example.baseball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.baseball.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    UserRepository repos;
    
    @GetMapping(path = "loginForm")
    String loginForm() {
        return "loginForm";
    }
}