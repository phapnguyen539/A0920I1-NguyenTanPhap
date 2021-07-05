package com.codegym.casestudy04.repository;

import com.codegym.casestudy04.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAllByEmployeeNameContaining(String name, Pageable pageable);
}
