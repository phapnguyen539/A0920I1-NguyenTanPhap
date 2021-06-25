package com.codegym.customer_manager.repository;

import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Integer> {
}
