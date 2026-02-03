package com.serbernal.adapter.inbound.rest.dto;

public class PersonaResponseDTO {

    private Long id;
    private String nombre;
    private int edad;

    public PersonaResponseDTO(Long id, String nombre, int edad) {
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
