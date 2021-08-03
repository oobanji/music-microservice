package com.example.shoppingcartservice.data;

import com.example.shoppingcartservice.models.ShoppingCart;
import com.example.shoppingcartservice.repository.ShoppingCartRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoppingCartDataGenerator {
    private static final Logger log = LoggerFactory.getLogger(ShoppingCartDataGenerator.class);

    @Bean
    CommandLineRunner initDatabase(ShoppingCartRepository shoppingCartRepository) {
        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();

        cart1.setCartId("0XERFJ45593CND");
        cart2.setCartId("cnbnfk97954sxana");

        shoppingCartRepository.create(cart1);
        shoppingCartRepository.create(cart2);
        return args -> {
            log.info("Preloading");
        };
    }
}
