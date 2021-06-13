package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer findById(int id);
    List<Customer> findAll();
    void save(Customer customer);
    void delete(int id);
}
