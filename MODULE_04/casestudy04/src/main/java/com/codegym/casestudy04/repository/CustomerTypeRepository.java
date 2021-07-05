package com.codegym.casestudy04.repository;

import com.codegym.casestudy04.model.Customer;
import com.codegym.casestudy04.model.Customer_type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerTypeRepository extends JpaRepository<Customer_type,Integer> {
}
