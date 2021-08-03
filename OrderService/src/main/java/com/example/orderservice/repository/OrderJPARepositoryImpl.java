package com.example.orderservice.repository;

import com.example.orderservice.models.OrderObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class OrderJPARepositoryImpl implements OrderRepository {
    @Autowired
    @Lazy
    private OrderJPARepository orderJPARepository;

    @Override
    public OrderObject create(OrderObject order) {
        return orderJPARepository.save(order);
    }

    @Override
    public OrderObject get(Long id) {
        return orderJPARepository.findById(id).orElseThrow();
    }
}
