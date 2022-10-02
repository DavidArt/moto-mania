package com.motomania.motoshop.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Motorcycle {

    private Long id;
    private String brand;
    private String model;
    private String color;
    private String engineCapacity;
    private String enginePower;
    private String fabricationYear;
}
