package com.app.dao;

import com.app.entity.OrderProduct;
import com.app.entity.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
