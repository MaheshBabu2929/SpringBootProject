package com.example.Mahesh.Repositories;

import com.example.Mahesh.Entities.MemberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberModel,Integer> {

 MemberModel findById(int memberId);
}
