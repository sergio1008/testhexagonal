package com.serbernal.service.impl;

import com.serbernal.model.Persona;
import com.serbernal.repository.IPersonaRepository;
import com.serbernal.service.IPersonaService;

import java.util.Collection;
import java.util.Optional;

public class PersonaServiceImpl implements IPersonaService {

    private final IPersonaRepository repository;
    public PersonaServiceImpl(IPersonaRepository repository){
        this.repository = repository;
    }
    @Override
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Persona update(Persona persona, Long id) {
        return repository.update(id, persona);
    }

    @Override
    public Collection<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return repository.findById(id);
    }
}
