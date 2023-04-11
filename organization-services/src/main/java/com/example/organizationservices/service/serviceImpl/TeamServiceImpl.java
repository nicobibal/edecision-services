package com.example.organizationservices.service.serviceImpl;

import com.example.organizationservices.model.Team;
import com.example.organizationservices.repositories.TeamRepository;
import com.example.organizationservices.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    @Override
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeam(Long id) {
        return teamRepository.findById(id).orElseThrow(() -> new TeamNotFoundException("Project not exist with id: " + id));
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team updateTeam(Team team, Long code) {
        team.setId(code);
        return teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Long code) {
        teamRepository.deleteById(code);
    }

}
