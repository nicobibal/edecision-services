package com.example.organizationservices.repositories;

import com.example.organizationservices.model.Member;
import com.example.organizationservices.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
