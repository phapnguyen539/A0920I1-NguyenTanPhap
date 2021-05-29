package com.codegym.customer_springboot.service;

import com.codegym.customer_springboot.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void delete(int id);

    Customer findByCustomerId(int id);
}
