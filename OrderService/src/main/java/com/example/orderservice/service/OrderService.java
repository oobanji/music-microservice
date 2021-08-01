package com.example.orderservice.service;

import com.example.orderservice.models.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order createOrder(Order Order);

    Order getOrder(Long orderId);
}
