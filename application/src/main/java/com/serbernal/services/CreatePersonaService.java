package com.serbernal.services;

import com.serbernal.model.Persona;
import com.serbernal.ports.inbound.CreatePersonaUseCase;
import com.serbernal.service.IPersonaService;

public class CreatePersonaService implements CreatePersonaUseCase {
    private final IPersonaService service;

    public CreatePersonaService(IPersonaService service) {
        this.service = service;
    }

    @Override
    public Persona execute(Persona persona) {
        return service.save(persona);
    }
}
