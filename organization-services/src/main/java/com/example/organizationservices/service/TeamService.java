package com.example.organizationservices.service;

import com.example.organizationservices.model.Team;

import java.util.List;

public interface TeamService {
    List<Team> getTeams();

    Team getTeam(Long id);

    Team saveTeam(Team team);

    Team updateTeam(Team team, Long code);

    void deleteTeam(Long code);
}
