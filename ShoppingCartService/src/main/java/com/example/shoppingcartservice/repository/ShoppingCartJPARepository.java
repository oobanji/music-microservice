package com.example.shoppingcartservice.repository;

import com.example.shoppingcartservice.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartJPARepository extends JpaRepository<ShoppingCart, Long> {
}
