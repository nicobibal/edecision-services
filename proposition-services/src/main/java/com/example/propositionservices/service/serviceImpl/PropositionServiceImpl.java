package com.example.propositionservices.service.serviceImpl;

import com.example.propositionservices.model.DTO.PropositionDTO;
import com.example.propositionservices.model.Proposition;
import com.example.propositionservices.model.Statut;
import com.example.propositionservices.repository.PropositionRepository;
import com.example.propositionservices.service.PropositionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropositionServiceImpl implements PropositionService {

        private final ModelMapper modelMapper;
        private final PropositionRepository propositionRepository;


        @Override
        public List<Proposition> getPropositions() {
                return propositionRepository.findAll();
        }

        @Override
        public Proposition getProposition(Long id) {
                return propositionRepository.findById(id).orElseThrow( () -> new PropositionNotFoundException("Proposition not exist with id: " + id));
        }

        @Override
        public Proposition saveProposition(PropositionDTO propositionDTO) {
                Proposition proposition = this.modelMapper.map(propositionDTO, Proposition.class);
                proposition.setStatut(Statut.PROPOSE);
                return propositionRepository.save(proposition);
        }

        @Override
        public Proposition updateProposition(Proposition proposition, Long id) {
                proposition.setIdProposition(id);
                return propositionRepository.save(proposition);
        }

        @Override
        public void deleteProposition(Long id) {
                propositionRepository.deleteById(id);
        }

        @Override
        public List<Proposition> getPropositionProject(Long projectId) {
                return propositionRepository.findPropositionsByIdProject(projectId);
        }

        @Override
        public List<Proposition> getPropositionTeam(Long teamId) {
                return propositionRepository.findPropositionsByIdTeam(teamId);
        }
}
