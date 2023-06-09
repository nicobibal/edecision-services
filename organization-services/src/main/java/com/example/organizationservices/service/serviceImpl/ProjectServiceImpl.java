package com.example.organizationservices.service.serviceImpl;

import com.example.organizationservices.model.Project;
import com.example.organizationservices.model.Team;
import com.example.organizationservices.repositories.ProjectRepository;
import com.example.organizationservices.service.ProjectService;
import com.example.organizationservices.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final TeamService teamService;


    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProject(Long code) {
        return projectRepository.findById(code).orElseThrow(() -> new ProjectNotFoundException("Project not exist with id: " + code));
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Project project, Long Id) {
        project.setId(Id);
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(Long code) {
        projectRepository.deleteById(code);
    }

    @Override
    public Project addTeamToProject(Long teamId, Long projectId){
        Team team = teamService.getTeam(teamId);
        Project project = this.getProject(projectId);
        project.addTeam(team);
        return projectRepository.save(project);
    }
}
