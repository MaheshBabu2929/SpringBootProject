package com.example.Mahesh.Services;

import java.util.List;
import com.example.Mahesh.Entities.mobile;
import com.example.Mahesh.Repositories.mobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mobileService {
    @Autowired
    mobileRepository MobileRepository;
    public List<mobile> getAllMobiles(){
        List<mobile> res =MobileRepository.findAll();
        return res;
    }
    public mobile getById(int mobileId){
        return MobileRepository.findById(mobileId);
    }

    public List<mobile> getByMobileName(String mobileName){
       return MobileRepository.findByMobileName(mobileName);

    }
    //InBuilt method we don't need to create a repository
    public void addMobile(mobile Mobile){
        MobileRepository.save(Mobile);
    }
    public void addAllMobile(List<mobile> Mobile){
        MobileRepository.saveAll(Mobile);
    }

    public void deleteById(int mobileId) {
        MobileRepository.deleteById(mobileId);
    }

    public void updateById(int mobileId, mobile updateMobile) {
       mobile old=MobileRepository.findById(mobileId);
       old.setMobileName(updateMobile.getMobileName());

       MobileRepository.save(old);
       
    }
}
