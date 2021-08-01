package com.example.orderservice.repository;

import com.example.orderservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<Order, Long> {
}
