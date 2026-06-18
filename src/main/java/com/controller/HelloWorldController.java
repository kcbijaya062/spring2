package com.controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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



    @GetMapping("/register")
    public String shoowRegisterpage() {
        return "registration";
    }
    @GetMapping ("/addition")
    public String showAddpage(){
        return "add" ; //display add.jsp page
    }
    @GetMapping("/doadd")
    public String doadd(@RequestParam int number1 , @RequestParam int number2 , Model model) {
        int sum = number1+number2;
        System.out.println("result is============="+sum); //printed in console
        model.addAttribute("sum" , sum);
        return "add"; //display the result back to add.jsp page
    }

    



    }
