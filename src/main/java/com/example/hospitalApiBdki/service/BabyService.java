package com.example.hospitalApiBdki.service;

import com.example.hospitalApiBdki.repo.BabyRepository;
import com.example.hospitalApiBdki.model.NameBabyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BabyService {
    private final BabyRepository babyRepository;

    @Autowired
    public BabyService(BabyRepository babyRepository) {
        this.babyRepository = babyRepository;
    }

    public List<NameBabyEntity> getAllBabies() {
        return babyRepository.findAll();
    }

    public NameBabyEntity saveBaby(NameBabyEntity baby) {
        return babyRepository.save(baby);
    }

    public String determineRoom(String babyName) {
        char lastChar = babyName.toLowerCase().charAt(babyName.length() - 1);
        return (isVowel(lastChar)) ? "Mawar" : "Melati";
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
