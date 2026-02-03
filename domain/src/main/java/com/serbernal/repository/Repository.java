package com.serbernal.repository;

import java.util.Collection;
import java.util.Optional;

public interface Repository <T, ID> {

    T save(T entity);
    T update(ID id, T entity);

    void delete(ID id);

    Collection<T> findAll();

    Optional<T> findById(ID id);
}
