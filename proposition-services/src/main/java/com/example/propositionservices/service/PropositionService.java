package com.example.propositionservices.service;

import com.example.propositionservices.model.DTO.PropositionDTO;
import com.example.propositionservices.model.Proposition;

import java.util.List;

public interface PropositionService {
    List<Proposition> getPropositions();

    Proposition getProposition(Long id);

    Proposition saveProposition(PropositionDTO propositionDTO);

    Proposition updateProposition(Proposition proposition, Long id);

    void deleteProposition(Long id);

    List<Proposition> getPropositionProject(Long projectId);

    List<Proposition> getPropositionTeam(Long teamId);
}
