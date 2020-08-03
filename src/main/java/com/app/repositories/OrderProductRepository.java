package com.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.domain.OrderProduct;
import com.app.domain.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
