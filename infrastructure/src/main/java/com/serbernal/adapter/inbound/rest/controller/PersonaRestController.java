package com.serbernal.adapter.inbound.rest.controller;

import com.serbernal.adapter.inbound.rest.dto.PersonaRequestDTO;
import com.serbernal.adapter.inbound.rest.dto.PersonaResponseDTO;
import com.serbernal.command.PersonaCommand;
import com.serbernal.model.Persona;
import com.serbernal.ports.inbound.CreatePersonaUseCase;
import com.serbernal.ports.inbound.UpdatePersonaUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

    private final  CreatePersonaUseCase createPersonaUseCase;
    private final UpdatePersonaUseCase updatePersonaUseCase;

    public PersonaRestController(
            CreatePersonaUseCase createPersonaUseCase,
            UpdatePersonaUseCase updatePersonaUseCase) {
        this.createPersonaUseCase = createPersonaUseCase;
        this.updatePersonaUseCase = updatePersonaUseCase;
    }


    @PostMapping
    public ResponseEntity<PersonaResponseDTO> save(@Valid @RequestBody PersonaRequestDTO requestDTO){

        Persona persona = new Persona(requestDTO.getId(), requestDTO.getNombre(), requestDTO.getEdad());
        persona = this.createPersonaUseCase.execute(persona);

        return ResponseEntity.ok(new PersonaResponseDTO(persona.id(), persona.name(), persona.age()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonaResponseDTO> update(@PathVariable(name = "id") Long id, @Valid @RequestBody PersonaRequestDTO requestDTO){
        PersonaCommand personaCommand = new PersonaCommand(id, new Persona(requestDTO.getId(), requestDTO.getNombre(), requestDTO.getEdad()));
        Persona persona = updatePersonaUseCase.execute(personaCommand);

        return ResponseEntity.accepted().body(new PersonaResponseDTO(persona.id(), persona.name(), persona.age()));
    }
}
