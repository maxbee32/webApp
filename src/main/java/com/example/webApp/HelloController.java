package com.example.webApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // meaning it is ready for web request
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
