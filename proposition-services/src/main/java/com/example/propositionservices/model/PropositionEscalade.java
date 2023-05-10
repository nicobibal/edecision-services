package com.example.propositionservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PropositionEscalade extends Proposition{

    private Proposition originalProposition;


}
