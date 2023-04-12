package com.example.organizationservices.service;

import com.example.organizationservices.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjects();
    Project getProject(Long code);

    Project saveProject(Project project);

    Project updateProject(Project project, Long Id);

    void deleteProject(Long code);
    Project addTeamToProject(Long teamId, Long projectId);
}
