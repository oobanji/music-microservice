package com.example.orderservice.data;

import com.example.orderservice.models.OrderObject;
import com.example.orderservice.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderGeneratedData {
    private static final Logger log = LoggerFactory.getLogger(OrderGeneratedData.class);

    @Bean
    CommandLineRunner initDatabase(OrderRepository orderRepository) {
        OrderObject order = new OrderObject();
        order.setFirstName("CRVZENA");
        order.setOrderId(67L);

        orderRepository.create(order);
        return args -> {
            log.info("Preloading");
        };
    }
}
