package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    List<Contract> findAllContract();
    Contract findById(int id);
    void save(Contract contract);
    void delete(int id);
}
