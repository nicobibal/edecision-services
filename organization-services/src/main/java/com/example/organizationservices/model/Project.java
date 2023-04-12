package com.example.organizationservices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @OneToMany(mappedBy ="project")
    private List<Team> teams = new ArrayList<>();

    public void addTeam(Team team){
        this.teams.add(team);
        if(team.getProject() != null){
            team.setProject(this);
        }
        else{
            System.out.println("La team à déjà un projet");
        }

    }

}
