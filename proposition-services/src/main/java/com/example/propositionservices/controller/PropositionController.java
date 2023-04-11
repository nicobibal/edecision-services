package com.example.propositionservices.controller;

import com.example.propositionservices.model.Proposition;
import com.example.propositionservices.service.PropositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PropositionController {

    private final PropositionService propositionService;


    public PropositionController(PropositionService propositionService) {
        this.propositionService = propositionService;
    }

    @GetMapping(path = "/propositions")
    public List<Proposition> getPropositions(){
        return propositionService.getPropositions();
    }

    @GetMapping(path = "/propositions/{id}")
    public Proposition getProposition(@PathVariable Long id){
        return propositionService.getProposition(id);
    }

    @PostMapping(path = "/propositions")
    public Proposition save(@RequestBody Proposition proposition){
        return propositionService.saveProposition(proposition);
    }

    @PutMapping(path = "/propositions/{id}")
    public Proposition updateProposition(@PathVariable Long id, @RequestBody Proposition proposition){
        return propositionService.updateProposition(proposition,id);
    }

    @DeleteMapping(path = "/propositions/{id}")
    public void deleteProposition(@PathVariable Long id){
        propositionService.deleteProposition(id);
    }
}
