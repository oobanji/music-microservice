package com.example.orderservice.controller;

import com.example.orderservice.models.OrderObject;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class OrderObjectController {
    private OrderRepository orderRepository;

    @Autowired
    public OrderObjectController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping(value = "Order", method = RequestMethod.POST)
    public OrderObject createOrder(@RequestBody OrderObject order) {
        return orderRepository.create(order);
    }

    @RequestMapping(value = "Order/get", method = RequestMethod.GET)
    public OrderObject getOrder(@RequestParam Long id) {
        return orderRepository.get(id);
    }
}
