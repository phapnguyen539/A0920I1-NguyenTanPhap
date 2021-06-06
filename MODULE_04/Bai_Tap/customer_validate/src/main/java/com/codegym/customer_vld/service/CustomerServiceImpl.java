package com.codegym.customer_vld.service;

import com.codegym.customer_vld.model.Customer;
import com.codegym.customer_vld.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page <Customer> findByNameCustomer(String lastName, Pageable pageable) {
        return customerRepository.findByLastNameContaining(lastName,pageable);
    }

    @Override
    public Customer findByIdCustomer(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);

    }
}
