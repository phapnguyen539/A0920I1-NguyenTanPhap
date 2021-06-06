package com.codegym.form_vld.service;

import com.codegym.form_vld.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvinceService {
    void save(Province province);
    void delete(int id);
    Page<Province> findAllProvince(Pageable pageable);
    Province findById(int id);

    List<Province> findAllProvince(Province province);
}
