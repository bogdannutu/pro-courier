package com.procourier.repository;

import com.procourier.model.Order;
import com.procourier.model.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

public final class PlainListRepository implements OrderRepository {

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Long put(Order item) {
        return null;
    }

    @Override
    public List<Long> putAll(List<Order> items) {
        return null;
    }
}