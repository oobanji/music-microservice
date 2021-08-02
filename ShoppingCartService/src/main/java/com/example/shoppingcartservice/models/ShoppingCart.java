package com.example.shoppingcartservice.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart {
    @Id
    private String CartId;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

    public String getCartId() {
        return CartId;
    }

    public void setCartId(String cartId) {
        CartId = cartId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
