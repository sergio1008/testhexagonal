package com.serbernal.services;

import com.serbernal.command.PersonaCommand;
import com.serbernal.model.Persona;
import com.serbernal.ports.inbound.UpdatePersonaUseCase;

public class UpdatePersonaService implements UpdatePersonaUseCase {
    @Override
    public Persona execute(PersonaCommand personaCommand) {
        return null;
    }
}
