package com.codegym.service;

import com.codegym.model.Cart;
import com.codegym.repository.CartRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepositoty cartRepositoty;

    @Override
    public List<Cart> findAll() {
        return cartRepositoty.findAll();
    }

    @Override
    public Cart findById(int id) {
        return cartRepositoty.findById(id).orElse(null);
    }

    @Override
    public void save(Cart cart) {
        cartRepositoty.save(cart);

    }

    @Override
    public void delete(int id) {
        cartRepositoty.deleteById(id);

    }
}
