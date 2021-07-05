package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);
    Page<Customer> findByNameCustomer(String name, Pageable pageable);
    void save(Customer customer);
    void delete(int id);
    Customer findById(int id);
}
