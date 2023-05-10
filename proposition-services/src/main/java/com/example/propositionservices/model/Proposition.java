package com.example.propositionservices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proposition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProposition;
    private String libelle;
    private String description;
    private Long idCreator;
    private Long idTeam;
    private Long idProject;
    private Boolean isForCommunity;
    @Enumerated(EnumType.STRING)
    private Statut statut;

    public Proposition(String libelle, String description, Long idCreator, Long idTeam) {
        this.libelle = libelle;
        this.description = description;
        this.idCreator = idCreator;
        this.idTeam = idTeam;
        this.isForCommunity = false;
        this.statut = Statut.PROPOSE;
    }
}
