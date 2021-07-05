package com.codegym.case_module04.service;

import com.codegym.case_module04.model.Employee;
import com.codegym.case_module04.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByNameEmployee(String name, Pageable pageable) {
        return employeeRepository.findAllByEmployeeNameContaining(name,pageable);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);

    }
}
