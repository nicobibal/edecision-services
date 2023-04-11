package com.example.organizationservices.controller;

import com.example.organizationservices.model.Member;
import com.example.organizationservices.model.Team;
import com.example.organizationservices.service.MemberService;
import com.example.organizationservices.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public List<Member> getMember(){ return memberService.getMembers();}

    @GetMapping(path = "{id}")
    public Member getMember(@PathVariable Long id){ return memberService.getMember(id); }

    @PostMapping(path = "{code}")
    public Member save(@RequestBody Member member){ return memberService.saveMember(member); }

    @PutMapping(path = "{code}")
    public Member updateMember(@PathVariable Long code, @RequestBody Member member){ return memberService.updateMember(member, code); }

    @DeleteMapping(path = "{code}")
    public void deleteMember(@PathVariable Long code){ memberService.deleteMember(code); }
}
