package com.motomania.motoshop.service;

import com.motomania.motoshop.domain.MotorcycleEntity;
import com.motomania.motoshop.dto.Motorcycle;
import com.motomania.motoshop.repo.MotorcycleRepo;
import com.motomania.motoshop.util.MapperUtil;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MotorcycleService {

    private final MotorcycleRepo motorcycleRepo;
    private final MapperUtil mapperUtil;

    public MotorcycleService(MotorcycleRepo motorcycleRepo, MapperUtil mapperUtil) {
        this.motorcycleRepo = motorcycleRepo;
        this.mapperUtil = mapperUtil;
    }

    public Motorcycle getMotorcycle(Long id) {
        MotorcycleEntity motorcycleEntity = motorcycleRepo
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No motorcycle found with this id = " + id));

        return mapperUtil.map(motorcycleEntity, Motorcycle.class);
    }

    public List<Motorcycle> getAllMotorcycles() {
        List<MotorcycleEntity> motorcycleEntityList = motorcycleRepo.findAll();

        return mapperUtil.mapList(motorcycleEntityList, Motorcycle.class);
    }

    public Motorcycle createMotorcycle(Motorcycle motorcycle) {
        MotorcycleEntity savedMotorcycle = motorcycleRepo
                .save(mapperUtil.map(motorcycle, MotorcycleEntity.class));

        return mapperUtil.map(savedMotorcycle, Motorcycle.class);
    }

    public Motorcycle updateMotorcycle(Motorcycle motorcycle) {
        MotorcycleEntity updatedMotorcycle = motorcycleRepo
                .save(mapperUtil.map(motorcycle, MotorcycleEntity.class));

        return mapperUtil.map(updatedMotorcycle, Motorcycle.class);
    }

    public void deleteMotorcycle(Long id) {
        if (motorcycleRepo.existsById(id)) {
            motorcycleRepo.deleteById(id);
        }
    }
}
