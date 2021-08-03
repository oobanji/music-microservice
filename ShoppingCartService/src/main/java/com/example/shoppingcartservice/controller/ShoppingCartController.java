package com.example.shoppingcartservice.controller;

import com.example.shoppingcartservice.models.CartItem;
import com.example.shoppingcartservice.models.ShoppingCart;
import com.example.shoppingcartservice.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ShoppingCart")
public class ShoppingCartController {
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    public ShoppingCartController(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @GetMapping("/{id}")
    public List<CartItem> getCartItems(@PathVariable String id) {
        return shoppingCartRepository.get(id).getCartItems();
    }

    @PutMapping("/{id}")
    public ShoppingCart createCart(@PathVariable String id) {
        ShoppingCart newCart = new ShoppingCart();
        newCart.setCartId(id);
        shoppingCartRepository.create(newCart);
        return newCart;
    }

    @DeleteMapping("{id}")
    public ShoppingCart deleteCart(@PathVariable String id) {
        return this.shoppingCartRepository.deleteCart(id);
    }

    @PutMapping("{id}/Item/{itemId}")
    public void addCartItem(@PathVariable String id, @PathVariable Long itemId) {

    }

    @DeleteMapping("{id}/Item/{itemId}")
    public void deleteCartItem(@PathVariable String id, @PathVariable Long itemId) {

    }

}
