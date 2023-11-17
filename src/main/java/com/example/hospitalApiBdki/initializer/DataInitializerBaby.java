package com.example.hospitalApiBdki.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.hospitalApiBdki.model.NameBabyEntity;
import com.example.hospitalApiBdki.service.BabyService;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializerBaby implements CommandLineRunner {

    private final BabyService babyService;

    @Autowired
    public DataInitializerBaby(BabyService babyService) {
        this.babyService = babyService;
    }

    @Override
    public void run(String... args) {
        // Nama-nama bayi yang ingin ditambahkan
        List<String> babyNames = Arrays.asList(
                "Abichandra", "Bagas", "Binar", "Bintang", "Bulan", "Candra", "Damar", "Dimas",
                "Arif", "Subhan", "Wanda", "Dewangga", "Yuan", "Yudan", "Reza", "Daniel",
                "Syarif", "Briantomo", "Yesti", "Aida"
        );

        // Tambahkan setiap nama bayi
        for (String name : babyNames) {
            babyService.saveBaby(new NameBabyEntity(name));
        }

        System.out.println("Nama-nama bayi telah ditambahkan.");
    }
}
