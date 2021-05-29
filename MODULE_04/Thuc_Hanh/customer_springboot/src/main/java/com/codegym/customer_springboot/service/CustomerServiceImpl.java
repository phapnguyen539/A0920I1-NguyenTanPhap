package com.codegym.customer_springboot.service;

import com.codegym.customer_springboot.model.Customer;
import com.codegym.customer_springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);

    }

    @Override
    public Customer findByCustomerId(int id) {
        return customerRepository.findById(id).orElse(null);
    }

}
