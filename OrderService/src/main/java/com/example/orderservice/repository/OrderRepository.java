package com.example.orderservice.repository;

import com.example.orderservice.models.OrderObject;

public interface OrderRepository {

    OrderObject create(OrderObject order);

    OrderObject get(Long id);
}
