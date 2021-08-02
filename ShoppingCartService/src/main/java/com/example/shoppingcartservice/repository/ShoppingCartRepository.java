package com.example.shoppingcartservice.repository;

import com.example.shoppingcartservice.models.CartItem;
import com.example.shoppingcartservice.models.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepository {
    List<CartItem> list(Long id);

    void create(String id);

    ShoppingCart deleteCart(String id);

    CartItem add(String id, Long itemId);

    CartItem deleteItem(String id, Long itemId);
}
