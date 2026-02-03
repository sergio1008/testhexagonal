package com.serbernal.command;

import com.serbernal.model.Persona;

public  record PersonaCommand(Long id, Persona persona) {
}
