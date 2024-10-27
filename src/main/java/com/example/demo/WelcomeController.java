package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the world of Devops!";
    }

    @GetMapping
    public String defaultPage(){
        return "This is the Default page";
    }
}
