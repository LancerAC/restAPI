package com.example.restapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @GetMapping("/main")
    public String mainListener(){
        return "Welcome!";
    }
}
