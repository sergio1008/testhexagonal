package com.serbernal.adapter.inbound.rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class PersonaRequestDTO {
    private Long id;

    @NotEmpty(message = "Nombre no puede ser vacio")
    @NotBlank(message = "Nombre no puede ser vacio" )
    private String nombre;
    @NotNull(message = "Edad es requerido")
    private int edad;


    public PersonaRequestDTO(Long id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
