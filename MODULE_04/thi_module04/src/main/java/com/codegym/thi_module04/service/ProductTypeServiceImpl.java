package com.codegym.thi_module04.service;

import com.codegym.thi_module04.model.ProductType;
import com.codegym.thi_module04.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;
    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    @Override
    public void save(ProductType productType) {
        productTypeRepository.save(productType);

    }

    @Override
    public void delete(int id) {
        productTypeRepository.deleteById(id);

    }

    @Override
    public ProductType findById(int id) {
        return productTypeRepository.findById(id).orElse(null);
    }
}
