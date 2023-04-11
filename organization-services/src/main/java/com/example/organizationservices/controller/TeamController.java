package com.example.organizationservices.controller;

import com.example.organizationservices.model.Team;
import com.example.organizationservices.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping
    public List<Team> getTeams(){ return teamService.getTeams();}

    @GetMapping(path = "{id}")
    public Team getTeam(@PathVariable Long id){ return teamService.getTeam(id); }

    @PostMapping(path = "{code}")
    public Team save(@RequestBody Team team){ return teamService.saveTeam(team); }

    @PutMapping(path = "{code}")
    public Team updateTeam(@PathVariable Long code, @RequestBody Team team){ return teamService.updateTeam(team, code); }

    @DeleteMapping(path = "{code}")
    public void deleteTeam(@PathVariable Long code){ teamService.deleteTeam(code); }
}
