package com.geekster.DataBaseRelationship.service;

import com.geekster.DataBaseRelationship.dao.LaptopRepo;
import com.geekster.DataBaseRelationship.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;
    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public Laptop getLaptopById(Integer laptopId) {
        return laptopRepo.findById(laptopId).get();
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop updateLaptop(Integer laptopId, Laptop laptop) {
        Laptop laptop1= laptopRepo.findById(laptopId).get();
        laptop1.setBrand(laptop.getBrand());
        laptop1.setName(laptop.getName());
        laptop1.setPrice(laptop.getPrice());
        return laptopRepo.save(laptop1);
    }

    public void deleteLaptop(Integer laptopId) {
        laptopRepo.deleteById(laptopId);
    }
}
