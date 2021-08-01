package com.example.orderservice.repository;

import com.example.orderservice.models.Order;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class OrderJPARepositoryImpl implements OrderRepository {

    private OrderJPARepository orderJPARepository;

    @Override
    public Order create(Order order) {
        return orderJPARepository.saveAndFlush(order);
    }

    @Override
    public Order get(Long id) {
        return orderJPARepository.findById(id).
                orElseThrow();
    }
}
