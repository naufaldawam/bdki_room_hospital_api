package com.example.hospitalApiBdki.repo;

import com.example.hospitalApiBdki.model.NameBabyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BabyRepository extends JpaRepository<NameBabyEntity, Long> {
    
}
