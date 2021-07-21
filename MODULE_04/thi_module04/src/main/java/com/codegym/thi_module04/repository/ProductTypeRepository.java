package com.codegym.thi_module04.repository;

import com.codegym.thi_module04.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
