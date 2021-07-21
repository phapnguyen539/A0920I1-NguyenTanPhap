package com.codegym.thi_module04.service;

import com.codegym.thi_module04.model.ProductType;

import java.util.List;

public interface ProductTypeService {
    List<ProductType> findAll();
    void save(ProductType productType);
    void  delete(int id);
    ProductType findById(int id);

}
