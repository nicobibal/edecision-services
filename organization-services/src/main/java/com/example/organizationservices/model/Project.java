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

    @ManyToMany
    @JoinTable( name = "association_project_team",
            joinColumns = @JoinColumn( name = "id_project" ),
            inverseJoinColumns = @JoinColumn( name = "id_team" ) )
    private List<Team> teams = new ArrayList<>();



}
