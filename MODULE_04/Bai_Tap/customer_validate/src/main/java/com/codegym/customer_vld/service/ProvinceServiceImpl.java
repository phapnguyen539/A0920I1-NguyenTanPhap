package com.codegym.customer_vld.service;

import com.codegym.customer_vld.model.Province;
import com.codegym.customer_vld.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> findAllProvince() {
        return provinceRepository.findAll();
    }

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void deleteProvince(int id) {
        provinceRepository.deleteById(id);

    }

    @Override
    public Province findById(int id) {
        return provinceRepository.findById(id).orElse(null);
    }
}
