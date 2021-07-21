package com.codegym.test.service;

import com.codegym.test.model.Role;
import com.codegym.test.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);

    }

    @Override
    public void delete(int id) {
        roleRepository.deleteById(id);

    }

    @Override
    public Role findById(int id) {
        return roleRepository.findById(id).orElse(null);
    }
}
