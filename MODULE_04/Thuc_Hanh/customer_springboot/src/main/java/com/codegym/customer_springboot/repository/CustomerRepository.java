package com.codegym.customer_springboot.repository;

import com.codegym.customer_springboot.model.Customer;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByNameContaining(String name);

    List<Customer> findAllCustomer();
}
