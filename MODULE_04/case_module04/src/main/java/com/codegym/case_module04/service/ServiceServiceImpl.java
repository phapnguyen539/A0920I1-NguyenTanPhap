package com.codegym.case_module04.service;

import com.codegym.case_module04.model.Service;
import com.codegym.case_module04.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service

public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Page<Service> findAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Service> findByNameService(String name, Pageable pageable) {
        return serviceRepository.findAllByServiceNameContaining(name,pageable);
    }

    @Override
    public Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);

    }

    @Override
    public void delete(int id) {
        serviceRepository.deleteById(id);
    }
}
