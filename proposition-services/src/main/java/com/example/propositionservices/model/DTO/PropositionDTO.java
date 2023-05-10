package com.example.propositionservices.model.DTO;

import com.example.propositionservices.model.Statut;
import lombok.Data;

@Data
public class PropositionDTO {
    private String libelle;
    private String description;
    private Long idCreator;
    private Long idTeam;

}
