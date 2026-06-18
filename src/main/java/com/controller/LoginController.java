package com.controller;


import com.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showloginForm(){
        return "login";
    }
    @PostMapping("/dologin")
    public String dologin(@RequestParam String email , @RequestParam String pswd, Model model){
        //System.out.println("email:"+ email);
        //System.out.println("password is "+password);
        //model.addAttribute("email",email);
       // model.addAttribute("password",password);

        // let me assueme my email as correct email stored in database with its password test
        String correctEmail = "kecybijaya@gmail.com";
        String correctPassword = "test";
        if(email.equals(correctEmail)&& pswd.equals(correctPassword)) {

            return "congrats"; //congrats.jsp
        }
        else{
            model.addAttribute("msg","please try again");
            return "login";
        }
}

    @GetMapping("/registration")
    public String showregistrationForm(){
        return "registration";
    }
    @PostMapping("/registration")
    public String doregistration(@ModelAttribute Employee employee , Model model){
        System.out.println(employee);
        model.addAttribute("message","registration done successfully");
        return "registration";
    }
}
