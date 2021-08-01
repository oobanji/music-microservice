package com.example.orderservice.repository;

import com.example.orderservice.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderJPARepositoryImpl implements OrderRepository {

    private final OrderJPARepository orderJPARepository;

    @Autowired
    public OrderJPARepositoryImpl(OrderJPARepository orderJPARepository) {
        this.orderJPARepository = orderJPARepository;
    }

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
