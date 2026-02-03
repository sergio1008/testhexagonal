package com.serbernal.adapter.outbound.persistence.impl;

import com.serbernal.adapter.outbound.persistence.entity.PersonaEntity;
import com.serbernal.adapter.outbound.persistence.repository.PersonaJpaRepository;
import com.serbernal.model.Persona;
import com.serbernal.repository.IPersonaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class PersonaRepositoryImpl implements IPersonaRepository {

    private final PersonaJpaRepository repository;
    public PersonaRepositoryImpl(PersonaJpaRepository repository){
        this.repository = repository;
    }
    @Override
    public Persona save(Persona entity) {
        PersonaEntity personaEntity = new PersonaEntity(entity.id(), entity.name(), entity.age());
        repository.save(personaEntity);
        return new Persona(
                personaEntity.getId(),
                personaEntity.getName(),
                personaEntity.getAge());
    }

    @Override
    public Persona update(Long id, Persona entity) {

        PersonaEntity personaEntity =  repository.findById(id).orElse(null);

        if(personaEntity != null){
            personaEntity.setName(entity.name());
            personaEntity.setAge(entity.age());
        }
        repository.save(personaEntity);

        return new Persona(personaEntity.getId(), personaEntity.getName(), personaEntity.getAge());
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Collection<Persona> findAll() {
        return null;
    }

    @Override
    public Optional<Persona> findById(Long aLong) {
        return Optional.empty();
    }
}
