package com.codegym.service;

import com.codegym.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAll();
    Cart findById(int id);
    void save(Cart cart);
    void delete(int id);
}
