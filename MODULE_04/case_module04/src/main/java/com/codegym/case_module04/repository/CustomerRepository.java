package com.codegym.case_module04.repository;

import com.codegym.case_module04.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByCustomerNameContaining(String name, Pageable pageable);
}
