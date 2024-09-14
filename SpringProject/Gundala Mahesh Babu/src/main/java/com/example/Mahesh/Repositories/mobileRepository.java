package com.example.Mahesh.Repositories;

import com.example.Mahesh.Entities.mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface mobileRepository extends JpaRepository<mobile,Integer> {
mobile findById(int mobileId);

List<mobile> findByMobileName(String mobileName);

}
