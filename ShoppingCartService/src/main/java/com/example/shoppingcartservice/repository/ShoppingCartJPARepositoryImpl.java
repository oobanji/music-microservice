package com.example.shoppingcartservice.repository;

import com.example.shoppingcartservice.models.CartItem;
import com.example.shoppingcartservice.models.ShoppingCart;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public class ShoppingCartJPARepositoryImpl implements ShoppingCartRepository {

    private ShoppingCartJPARepository shoppingCartJPARepository;

    @Override
    public List<CartItem> list(Long id) {
        return this.shoppingCartJPARepository.findById(id)
                .get().
                getCartItems();
    }

    @Override
    public void create(String id) {
        ShoppingCart cart = this.shoppingCartJPARepository.
                findAll().stream().filter(c -> c.getCartId() == id).
                findAny().orElseThrow();

    }

    @Override
    public ShoppingCart deleteCart(String id) {
        return null;
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
