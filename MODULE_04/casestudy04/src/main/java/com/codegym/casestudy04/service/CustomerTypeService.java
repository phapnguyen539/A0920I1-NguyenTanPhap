package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.CustomerType;

import java.util.List;

public interface CustomerTypeService  {
    List<CustomerType> findAll();
    void save(CustomerType customerType);
    void  delete(int id);
    CustomerType findById(int id);
}
