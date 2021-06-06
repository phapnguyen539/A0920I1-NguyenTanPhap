package com.codegym.customer_aop.service;

import com.codegym.customer_aop.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService  {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);
    Page<Customer> findByNameCustomer(String name,Pageable pageable);
}
