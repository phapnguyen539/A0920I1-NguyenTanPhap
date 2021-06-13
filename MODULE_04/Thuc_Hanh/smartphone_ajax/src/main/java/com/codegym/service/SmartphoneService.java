package com.codegym.service;

import com.codegym.model.Smartphone;

import java.util.List;

public interface SmartphoneService {
    List <Smartphone> findAll();
    Smartphone findById(int id);
    Smartphone save (Smartphone smartphone);
    void delete(int id);
}
