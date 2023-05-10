package com.example.propositionservices.controller;

import com.example.propositionservices.model.DTO.PropositionDTO;
import com.example.propositionservices.model.Proposition;
import com.example.propositionservices.service.PropositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propositions")
public class PropositionController {

    private final PropositionService propositionService;


    public PropositionController(PropositionService propositionService) {
        this.propositionService = propositionService;
    }

    @GetMapping
    public List<Proposition> getPropositions(){
        return propositionService.getPropositions();
    }

    @GetMapping(path = "/{id}")
    public Proposition getProposition(@PathVariable Long id){
        return propositionService.getProposition(id);
    }

    @GetMapping(path = "/team/{teamId}")
    public List<Proposition> getPropositionsTeam(@PathVariable Long teamId){
        return propositionService.getPropositionTeam(teamId);
    }

    @GetMapping(path = "/project/{projectId}")
    public List<Proposition> getPropositionsProject(@PathVariable Long projectId){
        return propositionService.getPropositionProject(projectId);
    }
    @PostMapping
    public Proposition save(@RequestBody PropositionDTO propositionDTO){
        return propositionService.saveProposition(propositionDTO);
    }

    @PutMapping(path = "/{id}")
    public Proposition updateProposition(@PathVariable Long id, @RequestBody Proposition proposition){
        return propositionService.updateProposition(proposition,id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProposition(@PathVariable Long id){
        propositionService.deleteProposition(id);
    }


}
