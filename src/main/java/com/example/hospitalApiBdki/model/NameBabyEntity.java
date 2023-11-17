package com.example.hospitalApiBdki.model;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@Entity
public class NameBabyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Default constructor for JPA
    public NameBabyEntity() {
    }

    // Constructor with a String parameter
    public NameBabyEntity(String name) {
        this.name = name;
    }
}
