package com.codegym.customer_vld.repository;

import com.codegym.customer_vld.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAll(Pageable pageable);
    Page <Customer> findByLastNameContaining(String lastName, Pageable pageable);

}
