package com.codegym.form_vld.service;

import com.codegym.form_vld.model.Province;
import com.codegym.form_vld.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public void save(Province province) {
        provinceRepository.save(province);

    }

    @Override
    public void delete(int id) {
        provinceRepository.deleteById(id);

    }

    @Override
    public Page<Province> findAllProvince(Pageable pageable) {
        return provinceRepository.findAll(pageable);
    }


    @Override
    public Province findById(int id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Province> findAllProvince(Province province) {
        return provinceRepository.findAll();
    }
}
