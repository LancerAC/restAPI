package com.example.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CarDto {

    private String brand;
    private int weight;
}
