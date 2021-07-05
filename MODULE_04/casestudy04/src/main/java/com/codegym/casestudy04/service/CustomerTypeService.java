package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.Customer_type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerTypeService  {
    Page<Customer_type> findAll(Pageable pageable);
    void save(Customer_type customer_type);
    void  delete(int id);
    Customer_type findById(int id);

}
