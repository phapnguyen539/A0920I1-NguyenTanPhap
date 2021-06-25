package com.codegym.customer_manager.service;

import com.codegym.customer_manager.exception.NotAvailableException;
import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAllByFirstNameContaining(String firstName,Pageable pageable);
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Customer findById(int id) throws Exception;
    void save(Customer customer) throws NotAvailableException;
    void delete(int id);

}
