package com.example.hospitalApiBdki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalApiBdki.service.BabyService;
import com.example.hospitalApiBdki.model.NameBabyEntity;

import java.util.List;

@RestController
@RequestMapping("/Babies")
public class BabyController {
    private final BabyService babyService;

    @Autowired
    public BabyController(BabyService babyService) {
        this.babyService = babyService;
    }

    @GetMapping
    public List<NameBabyEntity> getAllBabies() {
        return babyService.getAllBabies();
    }

    @PostMapping
    public NameBabyEntity saveBaby(@RequestBody NameBabyEntity baby) {
        return babyService.saveBaby(baby);
    }

    @GetMapping("/{babyName}/Room")
    public String determineRoom(@PathVariable String babyName) {
        return babyService.determineRoom(babyName);
    }
}
