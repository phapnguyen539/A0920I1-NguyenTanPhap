package com.codegym.customer_manager.service;

import com.codegym.customer_manager.model.Customer;
import com.codegym.customer_manager.model.Province;

import java.util.List;

public interface ProvinceService  {
    List<Province> findAll();
    Province findById(int id);
    void save(Province province);
    void delete(int id);
}
