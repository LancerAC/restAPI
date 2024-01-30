package com.example.restapi.Controller;

import com.example.restapi.Entity.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @GetMapping("/main")
    public String mainListener(){
        return "Welcome!";
    }


    @Autowired
    private ObjectMapper objectMapper;

    private Car createCar(){
        Car car = Car.builder()
                .brand("UAZ")
                .weight(2344)
                .build();

        return car;
    }

    @GetMapping("/get")
    @SneakyThrows
    public String getCar(){

        @NonNull
        String jsonData = objectMapper.writeValueAsString(createCar());

        return jsonData;

    }
}
