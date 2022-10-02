package com.motomania.motoshop.repo;

import com.motomania.motoshop.domain.MotorcycleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorcycleRepo extends JpaRepository<MotorcycleEntity, Long> {
}
