package com.codegym.thi_module04.repository;

import com.codegym.thi_module04.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Page<Product> findAllByNameContaining (String name, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
}
