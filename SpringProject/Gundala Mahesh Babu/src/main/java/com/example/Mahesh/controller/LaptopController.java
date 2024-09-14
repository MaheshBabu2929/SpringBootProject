package com.example.Mahesh.controller;

import com.example.Mahesh.Entities.Laptop;
import com.example.Mahesh.Services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptops/")
public class LaptopController {
@Autowired
LaptopService laptopService;
@GetMapping("getAll")
    public List<Laptop> getAllLaptops(){
    return laptopService.getAllLaptops();
}
@GetMapping("getById-{laptopId}")
    public Laptop getById(@PathVariable int laptopId){
    return laptopService.getById(laptopId);
}

@GetMapping("getByLaptopBrand-{laptopBrand}")
    public List<Laptop> getByLaptopBrand(@PathVariable  String laptopBrand){
    return laptopService.getByLaptopBrand(laptopBrand);
}

@PostMapping("addLaptop")
    public String addLaptop(@RequestBody Laptop laptop){
    laptopService.addLaptop(laptop);
    return "Successfully added a Laptop";
}
@PostMapping("addAllLaptop")
    public String addAllLaptop(@RequestBody List<Laptop> laptop){
        laptopService.addAllLaptop(laptop);
        return "Successfully added a Laptop";
    }
    @DeleteMapping("deleteById-{laptopId}")
    public String deleteById(@PathVariable int laptopId){
    laptopService.deleteById(laptopId);
    return "Successfully deleted by using the id:"+laptopId;
    }
}
