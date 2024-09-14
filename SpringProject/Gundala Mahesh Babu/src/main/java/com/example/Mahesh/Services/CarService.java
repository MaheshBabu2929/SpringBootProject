package com.example.Mahesh.Services;

import com.example.Mahesh.Entities.Car;
import com.example.Mahesh.Repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car getCarById(int carId){
        return carRepository.findById(carId);
    }
}
