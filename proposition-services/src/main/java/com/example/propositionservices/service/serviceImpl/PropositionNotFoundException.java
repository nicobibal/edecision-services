package com.example.propositionservices.service.serviceImpl;

public class PropositionNotFoundException extends RuntimeException {
    public PropositionNotFoundException(String message) {
        super(message);
    }
}
