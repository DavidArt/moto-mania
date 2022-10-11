package com.motomania.motoshop.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "motorcycle")
@Entity
public class MotorcycleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    private String engineCapacity;

    private String enginePower;

    private String fabricationYear;
}
