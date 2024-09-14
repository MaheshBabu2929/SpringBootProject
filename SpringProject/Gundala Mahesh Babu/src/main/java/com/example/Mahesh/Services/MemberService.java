package com.example.Mahesh.Services;

import com.example.Mahesh.Entities.MemberModel;
import com.example.Mahesh.Repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<MemberModel> getAllMemberModel() {
        List<MemberModel> res= memberRepository.findAll();
        return res;
    }

    public MemberModel getById(int memberId) {
        return memberRepository.findById(memberId);
    }

    public void addMember(MemberModel newMember) {
        memberRepository.save(newMember);
    }

    public void updateById(int memberId, MemberModel newUpdate) {
        MemberModel old_Data=memberRepository.findById(memberId);
        old_Data.setMemberName(newUpdate.getMemberName());
        old_Data.setMemberEmail(newUpdate.getMemberEmail());
        memberRepository.save(old_Data);
    }

    public void deleteById(int memberId) {
        memberRepository.deleteById(memberId);
    }
}
