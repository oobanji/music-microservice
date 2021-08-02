package com.example.orderservice.controller;

import com.example.orderservice.models.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class OrderController {

    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping(value = "Order", method = RequestMethod.POST)
    public Order createOrder(@RequestBody Order order) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Order getOrder(@RequestParam Long id) {
        return null;
    }
}
