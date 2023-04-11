package com.example.propositionservices.repository;

import com.example.propositionservices.model.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropositionRepository extends JpaRepository<Proposition, Long> {
}
