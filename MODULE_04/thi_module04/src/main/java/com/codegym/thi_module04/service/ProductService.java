package com.codegym.thi_module04.service;

import com.codegym.thi_module04.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Page <Product> findAll(Pageable pageable);
    Page <Product> findByNameProduct(String name, Pageable pageable);
    void save(Product product);
    void delete(int id);
    Product findById(int id);
    List<Product> findAll();

}
