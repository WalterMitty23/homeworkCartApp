package com.homework.springCartApp.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CartService {

    private final com.homework.springCartApp.service.Cart cart;

    public CartService(com.homework.springCartApp.service.Cart cart) {
        this.cart = cart;
    }

    public void add(Integer... ids) {
        cart.add(ids);
    }

    public Collection<Integer> getAll() {
        return cart.getAll();
    }
}
