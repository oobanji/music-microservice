package com.example.orderservice.repository;

import com.example.orderservice.models.Order;

public interface OrderRepository {
    Order create(Order order);

    Order get(Long id);
}
