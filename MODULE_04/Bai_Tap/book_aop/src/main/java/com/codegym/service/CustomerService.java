package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findByNameCustomer(String name, Pageable pageable);
    Customer findById(int id);
    void delete(int id);
    void save(Customer customer);
    Page<Customer> findAll(Pageable pageable);

}
