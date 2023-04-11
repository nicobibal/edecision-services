package com.example.organizationservices.service.serviceImpl;

import com.example.organizationservices.model.Member;
import com.example.organizationservices.repositories.MemberRepository;
import com.example.organizationservices.repositories.MemberRepository;
import com.example.organizationservices.service.MemberService;
import com.example.organizationservices.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id).orElseThrow(() -> new MemberNotFoundException("Project not exist with id: " + id));
    }

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member, Long code) {
        member.setId(code);
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Long code) {
        memberRepository.deleteById(code);
    }

}
