package com.serbernal.services;

import com.serbernal.command.PersonaCommand;
import com.serbernal.model.Persona;
import com.serbernal.ports.inbound.UpdatePersonaUseCase;
import com.serbernal.service.IPersonaService;

public class UpdatePersonaService implements UpdatePersonaUseCase {
    private final IPersonaService service;
    public UpdatePersonaService(IPersonaService service){

        this.service = service;
    }
    @Override
    public Persona execute(PersonaCommand personaCommand) {
        return service.update(personaCommand.persona(), personaCommand.id());
    }
}
