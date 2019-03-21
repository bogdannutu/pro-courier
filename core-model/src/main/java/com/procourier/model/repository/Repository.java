package com.procourier.model.repository;

import com.procourier.model.Order;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findById(Long id);
    List<T> getAll();
    Long insert(T item);
    List<Long> putAll(List<T> items);
}
