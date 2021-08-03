package com.example.shoppingcartservice.repository;

import com.example.shoppingcartservice.models.CartItem;
import com.example.shoppingcartservice.models.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class ShoppingCartJPARepositoryImpl implements ShoppingCartRepository {

    @Autowired
    @Lazy
    private ShoppingCartJPARepository shoppingCartJPARepository;

    @Override
    public ShoppingCart get(String id) {
        return this.shoppingCartJPARepository.findById(id).orElseThrow();
    }

    @Override
    public void create(ShoppingCart newCart) {
        shoppingCartJPARepository.save(newCart);
    }

    @Override
    public ShoppingCart deleteCart(String id) {
        ShoppingCart existingCart = shoppingCartJPARepository.getById(id);
        this.shoppingCartJPARepository.delete(existingCart);
        return existingCart;
    }

    @Override
    public CartItem add(String id, Long itemId) {
        return null;
    }

    @Override
    public CartItem deleteItem(String id, Long itemId) {
        return null;
    }
}
