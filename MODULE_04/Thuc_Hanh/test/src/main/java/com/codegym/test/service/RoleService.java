package com.codegym.test.service;

import com.codegym.test.model.Role;

import java.util.List;

public interface RoleService  {
    List<Role> findAll();
    void save(Role role);
    void  delete(int id);
    Role findById(int id);
}
