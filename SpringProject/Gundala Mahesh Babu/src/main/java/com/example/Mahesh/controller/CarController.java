package com.example.Mahesh.controller;

import com.example.Mahesh.Entities.Car;
import com.example.Mahesh.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Cars/")
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("getAll")
    public List<Car> getAll(){
        return carService.getAllCars();
    }
    @GetMapping("getById-{carId}")
    public Car getCarById(@PathVariable int carId){
        return carService.getCarById(carId);
    }
}
