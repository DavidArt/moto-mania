package com.motomania.motoshop.domain;

import javax.persistence.*;
import java.util.Objects;

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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotorcycleEntity that = (MotorcycleEntity) o;
        return id.equals(that.id) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(color, that.color) &&
                Objects.equals(engineCapacity, that.engineCapacity) &&
                Objects.equals(enginePower, that.enginePower) &&
                Objects.equals(fabricationYear, that.fabricationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, engineCapacity, enginePower, fabricationYear);
    }

    @Override
    public String toString() {
        return "MotorcycleEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
