package com.example.Mahesh.controller;

import com.example.Mahesh.Entities.mobile;
import com.example.Mahesh.Services.mobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mobiles/")
public class mobileController {
@Autowired
mobileService MobileService;
@GetMapping("getAll")
    public List<mobile> getAllMobiles(){
    return MobileService.getAllMobiles();
}
@GetMapping("getById-{mobileId}")
    public mobile getById(@PathVariable int mobileId){
    return MobileService.getById(mobileId);
}
@GetMapping("getByMobileName-{mobileName}")
    public List<mobile> getByMobileName(@PathVariable String mobileName){
    return MobileService.getByMobileName(mobileName);
}
@PostMapping("addMobile")
    public String addMobile(@RequestBody mobile Mobile){
    MobileService.addMobile(Mobile);
    return "Successfully added the new student:"+Mobile;
}
@PostMapping("addAllMobile")
    public String addAllMobile(@RequestBody List<mobile> Mobile){
        MobileService.addAllMobile(Mobile);
        return "Successfully added the new student:"+Mobile;
    }
@DeleteMapping("deleteById-{mobileId}")
    public String deleteById(@PathVariable int mobileId){
     MobileService.deleteById(mobileId);
     return "Deleted a mobile with id:"+mobileId;
}

@PutMapping("updateById-{mobileId}")
    public String updateById(@PathVariable int mobileId,@RequestBody mobile updateMobile)
{
    MobileService.updateById(mobileId, updateMobile);
    return "Successfully updated the details by id:"+mobileId;
}


}
