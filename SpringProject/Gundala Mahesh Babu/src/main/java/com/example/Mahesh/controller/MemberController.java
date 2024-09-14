package com.example.Mahesh.controller;

import com.example.Mahesh.Entities.MemberModel;
import com.example.Mahesh.Services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("getAll")
    public List<MemberModel> getAllMemberModel(){
        return memberService.getAllMemberModel();
    }
    @GetMapping("getById-{memberId}")
    public MemberModel getById(@PathVariable int memberId){
        return memberService.getById(memberId);
    }
    @PostMapping("addMember")
    public String addMember(@RequestBody MemberModel newMember){
        memberService.addMember(newMember);
        return "Successfully added new member with Id:"+newMember;
    }
    @PutMapping("updateById-{memberId}")
    public String updateById(@PathVariable int memberId,@RequestBody MemberModel newUpdate){
        memberService.updateById(memberId,newUpdate);
        return "Successfully updated with id:"+memberId;
    }
    @DeleteMapping("deleteById-{memberId}")
    public String deleteById(@PathVariable int memberId){
        memberService.deleteById(memberId);
        return "Successfully deleted By Id:"+memberId;
    }

}
