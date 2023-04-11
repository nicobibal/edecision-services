package com.example.organizationservices.service;

import com.example.organizationservices.model.Member;
import com.example.organizationservices.model.Project;

import java.util.List;

public interface MemberService {
    List<Member> getMembers();

    Member getMember(Long code);

    Member saveMember(Member member);

    Member updateMember(Member member, Long Id);

    void deleteMember(Long code);
}
