package com.codegym.casestudy04.repository;

import com.codegym.casestudy04.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
