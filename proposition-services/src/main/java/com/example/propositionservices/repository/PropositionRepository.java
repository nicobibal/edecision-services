package com.example.propositionservices.repository;

import com.example.propositionservices.model.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropositionRepository extends JpaRepository<Proposition, Long> {

    List<Proposition> findPropositionsByIdProject(Long idProject);

    List<Proposition> findPropositionsByIdTeam(Long idTeam);
}
