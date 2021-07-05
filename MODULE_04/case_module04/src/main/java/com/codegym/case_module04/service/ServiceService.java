package com.codegym.case_module04.service;

import com.codegym.case_module04.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface ServiceService {
    Page<Service> findAllService(Pageable pageable);
    Page<Service> findByNameService(String name,Pageable pageable);
    Service findById(int id);
    void save(Service service);
    void delete(int id);
}
