package com.codegym.repository;

import com.codegym.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CartRepositoty extends JpaRepository<Cart,Integer> {

}
