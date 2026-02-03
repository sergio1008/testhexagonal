package com.serbernal.adapter.inbound.rest.controller;

import com.serbernal.adapter.inbound.rest.dto.PersonaRequestDTO;
import com.serbernal.adapter.inbound.rest.dto.PersonaResponseDTO;
import com.serbernal.model.Persona;
import com.serbernal.ports.inbound.CreatePersonaUseCase;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

    private final  CreatePersonaUseCase createPersonaUseCase;

    public PersonaRestController(CreatePersonaUseCase createPersonaUseCase) {
        this.createPersonaUseCase = createPersonaUseCase;
    }


    @PostMapping
    public ResponseEntity<PersonaResponseDTO> save(@Valid @RequestBody PersonaRequestDTO requestDTO){

        Persona persona = new Persona(requestDTO.getId(), requestDTO.getNombre(), requestDTO.getEdad());
        persona = this.createPersonaUseCase.execute(persona);

        return ResponseEntity.ok(new PersonaResponseDTO(persona.id(), persona.name(), persona.age()));
    }
}
