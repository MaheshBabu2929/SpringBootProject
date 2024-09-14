package com.example.Mahesh.Repositories;

import com.example.Mahesh.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
Car findById(int carId);
}
