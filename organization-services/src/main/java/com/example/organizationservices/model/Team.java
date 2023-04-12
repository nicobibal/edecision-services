package com.example.organizationservices.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonIgnore
    private Project project;
    @ManyToMany
    @JoinTable( name = "association_member_team",
            joinColumns = @JoinColumn( name = "id_team" ),
            inverseJoinColumns = @JoinColumn( name = "id_member" ) )
    private List<Member> members;


    public void addMember(Member member){
        this.members.add(member);
        member.getTeams().add(this);
    }

}
