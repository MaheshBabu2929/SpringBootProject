package com.example.Mahesh.Services;

import com.example.Mahesh.Entities.Laptop;
import com.example.Mahesh.Repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
@Autowired
LaptopRepository laptopRepository;
public List<Laptop> getAllLaptops(){
    return laptopRepository.findAll();
}

public Laptop getById(int laptopId){
    return laptopRepository.findById(laptopId);
}

public List<Laptop> getByLaptopBrand(String laptopBrand){
    return laptopRepository.findByLaptopBrand(laptopBrand);
}

    public void addLaptop(Laptop laptop) {
    laptopRepository.save(laptop);
    }

    public void addAllLaptop(List<Laptop> laptop) {
    laptopRepository.saveAll(laptop);
    }

    public void deleteById(int laptopId) {
     laptopRepository.deleteById(laptopId);
    }
}
