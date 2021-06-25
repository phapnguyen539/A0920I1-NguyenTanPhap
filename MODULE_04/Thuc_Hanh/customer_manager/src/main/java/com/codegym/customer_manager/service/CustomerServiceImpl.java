package com.codegym.customer_manager.service;

import com.codegym.customer_manager.exception.NotAvailableException;
import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;
import com.codegym.customer_manager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstName,pageable);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
    @Override
    public Customer findById(int id) throws Exception {
       Customer customer= customerRepository.findById(id).orElse(null);
       if(customer==null){
           throw new Exception("Customer null");
       }
       return customer;
    }
    @Override
    public void save(Customer customer) throws NotAvailableException {
        try{
        customerRepository.save(customer);
    }catch (DataIntegrityViolationException e){
            throw  new NotAvailableException();
        }
    }
    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
