package com.codegym.customer_vld.service;

import com.codegym.customer_vld.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvinceService {
    List<Province> findAllProvince();
    void saveProvince(Province province);
    void deleteProvince(int id);
    Province findById(int id);
}

