package com.codegym.case_module04.repository;

import com.codegym.case_module04.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends JpaRepository<Service,Integer> {
    Page<Service> findAllByServiceNameContaining(String name, Pageable pageable);
}
