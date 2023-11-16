package com.cursosVirtuales.cursosVirtualesbackend.services;

import java.util.List;

public interface Service<T,ID> {
    T add(T entity);
    void update(T entity);

    T delete (ID id);

    T getById(ID id);

    List<T> getAll();


}
