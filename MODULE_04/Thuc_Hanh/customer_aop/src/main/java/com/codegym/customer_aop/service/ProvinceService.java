package com.codegym.customer_aop.service;

import com.codegym.customer_aop.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProvinceService {
    Page<Province> findAllProvince(Pageable pageable);
    Province findById(int id);
}
