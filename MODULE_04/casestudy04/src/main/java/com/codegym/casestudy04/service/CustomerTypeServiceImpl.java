package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.CustomerType;
import com.codegym.casestudy04.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);

    }

    @Override
    public void delete(int id) {
        customerTypeRepository.deleteById(id);

    }

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id).orElse(null);
    }
}
