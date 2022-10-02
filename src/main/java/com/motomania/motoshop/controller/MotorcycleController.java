package com.motomania.motoshop.controller;

import com.motomania.motoshop.dto.Motorcycle;
import com.motomania.motoshop.service.MotorcycleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/motorcycle")
public class MotorcycleController {

    private final MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @GetMapping("{id}")
    public Motorcycle getMotorcycle(@PathVariable Long id) {
        return motorcycleService.getMotorcycle(id);
    }

    @GetMapping("/all")
    public List<Motorcycle> getAllMotorcycles() {
        return motorcycleService.getAllMotorcycles();
    }

    @PostMapping
    public Motorcycle createMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.createMotorcycle(motorcycle);
    }

    @PutMapping
    public Motorcycle updateMotorcycle(@RequestBody Motorcycle motorcycle) {
        return motorcycleService.updateMotorcycle(motorcycle);
    }

    @DeleteMapping("{id}")
    public void deleteMotorcycle(@PathVariable Long id){
        motorcycleService.deleteMotorcycle(id);
    }
}
