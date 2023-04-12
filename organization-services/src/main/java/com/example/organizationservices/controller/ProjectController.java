package com.example.organizationservices.controller;


import com.example.organizationservices.model.Project;
import com.example.organizationservices.service.ProjectService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getProjects(){
        return projectService.getProjects();
    }

    @GetMapping(path = "/{id}")
    public Project getProject(@PathVariable(name = "id") Long code){
        return projectService.getProject(code);
    }

    @PostMapping
    public Project save(@RequestBody Project project){
        return  projectService.saveProject(project);
    }

    @PutMapping(path="/{code}")
    public Project updateProject(@PathVariable Long code, @RequestBody Project project){
        return  projectService.updateProject(project, code);
    }

    @DeleteMapping(path="/{code}")
    public void deleteProject(@PathVariable Long code){
        projectService.deleteProject(code);
    }

    @PostMapping(path = "/{projectId}/team/{teamId}")
    public Project addTeamToProject(@PathVariable Long projectId, @PathVariable Long teamId){
        return projectService.addTeamToProject(projectId, teamId);
    }
}

