package com.codegym.customer_aop.service;

import com.codegym.customer_aop.model.Province;
import com.codegym.customer_aop.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public Page<Province> findAllProvince( Pageable pageable) {
        return provinceRepository.findAll(pageable);
    }

    @Override
    public Province findById(int id) {
        return provinceRepository.findById(id).orElse(null);
    }
}
