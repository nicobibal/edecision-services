package com.example.organizationservices.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @ManyToMany(mappedBy = "teams")
    private List<Project> projects;

    @ManyToMany
    @JoinTable( name = "association_member_team",
            joinColumns = @JoinColumn( name = "id_team" ),
            inverseJoinColumns = @JoinColumn( name = "id_member" ) )
    private List<Member> members;


}
