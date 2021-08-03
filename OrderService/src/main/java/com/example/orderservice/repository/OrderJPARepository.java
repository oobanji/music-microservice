package com.example.orderservice.repository;

import com.example.orderservice.models.OrderObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<OrderObject, Long> {

}
