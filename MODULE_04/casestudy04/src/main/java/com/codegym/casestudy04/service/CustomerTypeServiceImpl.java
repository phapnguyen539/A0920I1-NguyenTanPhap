package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.Customer_type;
import com.codegym.casestudy04.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public Page<Customer_type> findAll(Pageable pageable) {
        return customerTypeRepository.findAll(pageable);
    }

    @Override
    public void save(Customer_type customer_type) {
        customerTypeRepository.save(customer_type);

    }

    @Override
    public void delete(int id) {
        customerTypeRepository.deleteById(id);

    }

    @Override
    public Customer_type findById(int id) {
        return customerTypeRepository.findById(id).orElse(null);
    }
}
