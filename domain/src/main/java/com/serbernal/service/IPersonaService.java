package com.serbernal.service;

import com.serbernal.model.Persona;

import java.util.Collection;
import java.util.Optional;

public interface IPersonaService {

    Persona save(Persona persona);
    void delete(Long id);
    Persona update(Persona persona, Long id);

    Collection<Persona> findAll();

    Optional findById(Long id);
}
