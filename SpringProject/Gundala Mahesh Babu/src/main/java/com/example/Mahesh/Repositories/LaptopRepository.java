package com.example.Mahesh.Repositories;

import com.example.Mahesh.Entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
Laptop findById(int laptopId);

List<Laptop> findByLaptopBrand(String laptopBrand);
}
