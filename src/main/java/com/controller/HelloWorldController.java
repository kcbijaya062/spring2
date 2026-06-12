package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")

    public String showHellopage() {
        return "sayhello";
    }


    @GetMapping("/second")
    public String showSecondpage() {
        return "sayhello2";
    }

    @GetMapping("/login")
    public String showLoginpage() {
        return "login";
    }

    @GetMapping("/register")
    public String shoowRegisterpage() {
        return "registration";
    }
}