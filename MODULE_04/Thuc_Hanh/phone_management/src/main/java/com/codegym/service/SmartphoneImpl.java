package com.codegym.service;

import com.codegym.model.Smartphone;
import com.codegym.repository.SmartphoneRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneImpl implements SmartphoneService {

    @Autowired
    SmartphoneRepositoty smartphoneRepositoty;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepositoty.findAll();
    }

    @Override
    public Smartphone findById(Integer id) {
        return smartphoneRepositoty.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepositoty.save(phone);
    }

    @Override
    public Smartphone remove(Integer id) {
        Smartphone smartphone=findById(id);
        smartphoneRepositoty.deleteById(id);
        return smartphone;
    }
}
