package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Contract;
import com.codegym.casestudy04.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    ContractRepository contractRepository;
    @Override
    public List<Contract> findAllContract() {
        return contractRepository.findAll();
    }
    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }
    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }
    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }
}
