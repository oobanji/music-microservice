package com.example.orderservice.controller;

import com.example.orderservice.models.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class OrderController {

    @RequestMapping(value = "Order", method = RequestMethod.POST)
    public Order createOrder(@RequestBody Order order) {
        return null;
    }

    @RequestMapping(value = "Order", method = RequestMethod.GET)
    public Order getOrder(@RequestParam Long id) {
        return null;
    }
}
