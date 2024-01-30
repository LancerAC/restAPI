package com.example.restapi.Controller;

import com.example.restapi.Entity.Car;
import com.example.restapi.dto.CarDto;
import com.example.restapi.repository.CarRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class CarController {
    @GetMapping("/main")
    public String mainListener(){
        return "Welcome!";
    }


    private final CarRepository carRepository;


    @PostMapping("/add")
    public void addCar(@RequestBody CarDto carDto){
        Car car = Car.builder()
                .brand(carDto.getBrand())
                .weight(carDto.getWeight())
                .build();
        log.info("Car created: " + carRepository.save(car));
    }

    @GetMapping("/getAll")
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Car getCarById(@PathVariable Long id){
        return carRepository.findById(id)
                .orElseThrow(()
                        -> new RuntimeException(
                                "Not found"));
    }
}
