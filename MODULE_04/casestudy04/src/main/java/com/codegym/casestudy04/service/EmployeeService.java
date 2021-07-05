package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);
    Page<Employee> findByNameEmployee(String name, Pageable pageable);
    Employee findById(int id);
    void save(Employee employee);
    void delete(int id);
}
