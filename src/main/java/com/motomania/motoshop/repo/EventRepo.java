package com.motomania.motoshop.repo;

import com.motomania.motoshop.domain.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<EventEntity, Long> {
}
