package com.serbernal.adapter.outbound.persistence.repository;

import com.serbernal.adapter.outbound.persistence.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, Long> {
}
