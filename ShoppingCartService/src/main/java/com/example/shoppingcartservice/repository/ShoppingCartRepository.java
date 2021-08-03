package com.example.shoppingcartservice.repository;

import com.example.shoppingcartservice.models.CartItem;
import com.example.shoppingcartservice.models.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepository {
    ShoppingCart get(String id);

    void create(ShoppingCart cart);

    ShoppingCart deleteCart(String id);

    CartItem add(String id, Long itemId);

    CartItem deleteItem(String id, Long itemId);
}
