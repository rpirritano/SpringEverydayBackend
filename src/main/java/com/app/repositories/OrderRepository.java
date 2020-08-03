package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
