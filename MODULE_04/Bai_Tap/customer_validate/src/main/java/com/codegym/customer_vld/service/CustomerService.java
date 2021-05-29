package com.codegym.customer_vld.service;

import com.codegym.customer_vld.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);
    Page <Customer> findByNameCustomer(String lastName, Pageable pageable);
    Customer findByIdCustomer(int id);
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
}
